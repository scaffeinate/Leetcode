DIRS = ['java', 'javascript', 'ruby']

def is_capital(c)
    return (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')
end

def add_spaces(capitalized_word)
    res = ""
    capitalized_word.each_char.with_index do |c, i|
        if(is_capital(c) && !(i == 0 || ((c == 'I' || c == 'V') && (capitalized_word[i-1] == 'I')) || (c == 'S' && capitalized_word[i-1] == 'B') || (c == 'T' && capitalized_word[i-1] == 'S')))
            res += " #{c}"
        else
            res += c
        end
    end
    return res
end

def update_class_name(file)
    ext = File.extname file
    base_name = File.basename file, ext
    return if base_name == "GuessNumberHigherOrLower"
    content = File.read(file)
    i = content.index(/class/)
    j = content.index(/{/)
    substr = content[i, (j-i+1)]
    parts = substr.split(" ")
    if parts[1] != base_name && parts[1] != "TreeNode"
        cleand = content.gsub("class #{parts[1]} {", "class #{base_name} {")
        File.open(file, 'w') { |f| f.write(cleand) }
    end
end

def normalize_name(file)
    ext = File.extname file
    base_name = File.basename file, ext
    res = ""
    if ext == ".rb"
        parts = base_name.split("_")
        parts.each do |part|
          if part == "i" || part == "ii" || part == "iii" || part == "iv" || part == "bst"
            res += part.upcase + " "
          else
            res += (part[0].upcase + part[1, part.length-1]) + " "
          end
        end
    elsif ext == ".js"
        res = add_spaces(base_name[0].upcase + base_name[1, base_name.length-1])
    elsif ext == ".java"
        res = add_spaces(base_name)
    end
    return res.strip
end

def update
    java_files = Dir[DIRS[0] + "/src/leetcode/**/*.java"]
    js_files = Dir[DIRS[1] + "/**/*.js"]
    ruby_files = Dir[DIRS[2] + "/**/*.rb"]
    files_map = {}
    
    java_files.each do |file|
        update_class_name(file)
        name = normalize_name(file)
        files_map[name] = [file]
    end
    
    js_files.each do |file|
        name = normalize_name(file)
        if files_map.has_key?(name)
            files_map[name].push(file)
        else
            files_map[name] = [file]
        end
    end
    
    ruby_files.each do |file|
        name = normalize_name(file)
        if files_map.has_key?(name)
            files_map[name].push(file)
        else
            files_map[name] = [file]
        end
    end

    read_me_content = File.read("README.md")
    lines = read_me_content.split("\n")
    final_content = ""
    lines.each do |line|
        parts = line.split("|")
        final_content += line
        values = files_map[parts[1]]
        values.each do |value|
            ext = File.extname value
            temp = ext[1, ext.length-1]
            final_content += "[#{temp}](https://github.com/scaffeinate/leetcode/blob/master/#{value}),"
        end
        final_content += "|\n"
    end
    File.open("N_README.md", "a") do |f|
        f.write final_content
    end
end

update()