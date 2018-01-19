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
        p name
        if files_map.has_key?(name)
            files_map[name].push(file)
        else
            files_map[name] = [file]
        end
    end
    sum = 0
    files_map.map do |k,v|
        sum += 1 if v.length < 3
    end
    #p files_map["Roman To Int"]
    p sum
    files_map.each do |k,v|
        p v if(v.length < 3)
    end
end

update()