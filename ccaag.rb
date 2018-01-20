require 'git'

DIFFICULTIES = ['easy', 'medium', 'hard']
BASE_URL = "https://github.com/scaffeinate/leetcode/blob/master"

def get_multiline_input
  input = ""
  while (text = gets) != "N\n" && (text != "S\n")
    input << text
  end
  return (text == "S\n") ? "" : input
end

def create_file(file_path, content)
    File.open(file_path, "w") do |f|
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

    puts "\nEnter Leetcode problem difficulty; 0 for easy, 1 for medium, 2 for hard:"
    difficulty = gets.chomp.to_i

    java_dir = "java/src/leetcode/#{DIFFICULTIES[difficulty]}"
    javascript_dir = "javascript/#{DIFFICULTIES[difficulty]}"
    ruby_dir = "ruby/#{DIFFICULTIES[difficulty]}"

    puts "\nPaste Java code; Type N when done, S to skip:"
    java_code = get_multiline_input

    if java_code.length > 0
        java_file_name = problem_name.split(" ").join("") + ".java"
        java_file_path = "#{java_dir}/#{java_file_name}"
        create_file(java_file_path, java_code)
        puts "\nWrote to #{java_file_path}"
    end

    puts "\nPaste Javascript code; Type N when done, S to skip:"
    javascript_code = get_multiline_input

    if javascript_code.length > 0
        javascript_file_name = (problem_name[0].downcase + problem_name[1, problem_name.length-1]).split(" ").join("") + ".js"
        javascript_file_path = "#{javascript_dir}/#{javascript_file_name}"
        create_file(javascript_file_path, javascript_code)
        puts "\nWrote to #{javascript_file_path}"
    end

    puts "\nPaste Ruby code; Type N when done, S to skip:"
    ruby_code = get_multiline_input

    if ruby_code.length > 0
        ruby_file_name = problem_name.split(" ").join("_").downcase + ".rb"
        ruby_file_path = "#{ruby_dir}/#{ruby_file_name}"
        create_file(ruby_file_path, ruby_code)
        puts "\nWrote to #{ruby_file_path}"
    end

    File.open("README.md", "a") do |f|
        temp = DIFFICULTIES[difficulty]
        difficulty_level = temp[0].upcase + temp[1, temp.length-1]
        links = ""
        links += "[java](#{BASE_URL}/#{java_file_path})," if java_code.length > 0
        links += "[js](#{BASE_URL}/#{javascript_file_path})," if javascript_code.length > 0
        links += "[rb](#{BASE_URL}/#{ruby_file_path})" if ruby_code.length > 0
        f.write("#{problem_no}|#{problem_name}|#{links}|\n")
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
