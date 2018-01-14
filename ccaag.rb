require 'git'

def get_multiline_input
  input = ""
  while (text = gets) != "N\n" && (text != "S\n")
    input << text
  end
  return (text == "S\n") ? "" : input
end

def create_file(dir, file_name, content)
    File.open(dir + file_name, "w") do |f|
        f.write(content)
    end
end

def init
    g = Git.init
    puts "\nWelcome. CREATE COMMIT AND ADD TO GIT"
    puts "\nGood job! Seems like you are done with a problem."
    puts "\nEnter Leetcode problem #:"
    problem_no = gets.chomp

    puts "\nEnter Leetcode problem name:"
    problem_name = gets.chomp

    puts "\nPaste Java code; Type N when done, S to skip:"
    java_code = get_multiline_input

    if java_code.length > 0
        java_file_name = problem_name.split(" ").join("") + ".java"
        create_file("java/src/leetcode/easy/", java_file_name, java_code)
        puts "\nWrote to java/src/leetcode/easy/#{java_file_name}"
    end

    puts "\nPaste Javascript code; Type N when done, S to skip:"
    javascript_code = get_multiline_input

    if javascript_code.length > 0
        javascript_file_name = (problem_name[0].downcase + problem_name[1, problem_name.length-1]).split(" ").join("") + ".js"
        create_file("javascript/easy/", javascript_file_name, javascript_code)
        puts "\nWrote to javascript/easy/#{javascript_file_name}"
    end

    puts "\nPaste Ruby code; Type N when done, S to skip:"
    ruby_code = get_multiline_input

    if ruby_code.length > 0
        ruby_file_name = problem_name.split(" ").join("_").downcase + ".rb"
        create_file("ruby/easy/", ruby_file_name, ruby_code)
        puts "\nWrote to ruby/easy/#{ruby_file_name}"
    end

    puts "\nExcellent! Do you want to commit to Git? (Y/N)"
    commit_to_git = gets.chomp

    if(commit_to_git == "Y")
        g.add(:all=>true)
        g.commit "Added solutions for Leetcode #{problem_no}. #{problem_name}"
    end

    puts "\nWanna push? (Y/N)"
    wanna_push = gets.chomp
    if wanna_push == "Y"
        g.push
        puts "Pushed to master :)"
    end
    puts "Success! Goodbye!\n"
end

init()
