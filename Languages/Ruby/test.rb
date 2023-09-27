salutation = Proc.new do |func_var_string = "Mundo"| "Olá, #{func_var_string}!" end
  puts salutation.call
  puts salutation.call("Amigo")