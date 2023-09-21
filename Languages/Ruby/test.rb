puts true && true, true && false, false && true, false && false

#ou
puts true || true, true || false, false || true, false || false

#não
puts !true, !false

#and (curto-circuito)
puts (true and true), (true and false), (false and true), (false and false)

#or (curto-circuito)
puts (true or true), (true or false), (false or true), (false or false)

#not (curto-circuito)
puts (not true), (not false)

#e (Bit a Bit)
puts (10 & 3)
#1010 & 0011 = 0010

#ou (Bit a Bit)
puts (10 | 3)
#1010 | 0011 = 1011

#não (Bit a Bit) - Positivo
puts (~ 10), (~ 3)
#0 1010 -> 1 0101
#0 0011 -> 1 1100

#não (Bit a Bit) - Negativo
puts (~ -10), (~ -3)
#
#