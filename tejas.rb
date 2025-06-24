Student record using Hash and Cases
# Hashes & symbols
def records(students)
    puts"The Result: "
students.each{
    |name,marks|
    puts"#{name} got #{marks} out of 100"
}
end  
def addstd(students)
    loop  do
    puts"Enter a name or 'done' is enough"
    name = gets.chomp
    break if name.downcase == "done"
    
    puts"Enter Marks of the student ( /100): "
    marks = gets.chomp.to_i
    students[name] = marks

end
end
def updmrk(students)
     puts "Enter the name of the Student whose marks are to be updated: "
    name = gets.chomp
    if students.key?(name)
        puts"enter new marks: "
        students[name]= gets.chomp.to_i
        puts">>#{name}'s marks updated sucessfully"
    else
        puts"Student not found"
    end
end
def delstd(students)
    puts"Enter the name of the student: "
    name = gets.chomp
    if students.key?(name)
        students.delete(name)
        puts"The Record successfully deleted"
    else
        puts"No student found"
    end
end    
students = {
    "Tejas Ulawekar"=>90,
    "Ayush Mhaskar"=>90,
    "Harsh Koli"=>95,
    "Harsh Chavan"=>99,
    "Harsh Bhagat'=>95,
    "Arya Kadam"=>100,
    "Vighnesh Berde"=>100
}

loop do
    puts "\n-----------------------------"

    puts"\n Choose an action to perform: "
    puts"\n 1] Add more student records "
    puts"\n 2] view Student records "
    puts"\n 3] Update student's marks"
    puts"\n 4] Delete a student's account "
    puts"\n 5] Exit"
    puts "\n-----------------------------"
    print"\n Choose from option[1...5]: "
    
    choice = gets.chomp
    
    case choice
    when "1"
        addstd(students)
        records(students)
    when "2"
        records(students)
    when "3"
        updmrk(students)
        records(students)
    when "4"
        delstd(students)
        records(students)
    when "5"
        puts"Thank you"
        break
    else
        puts"Invalid input please choose (1 - 5)"
end   
puts"--------------------------------"
puts "want to perform more operation (y/n)?: "
  repeat = gets.chomp
if repeat.downcase == "n"
    puts "Thank you!!"
    break
end    
end