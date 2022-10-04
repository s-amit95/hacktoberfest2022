library ieee;
use ieee.std_logic_1164.all;
entity mux is
port(
s:in std_logic_vector(1 downto 0);
a:in std_logic_vector(3 downto 0);
y:out std_logic
);
end mux;
architecture rtl of mux is
begin
process(s,a)
begin
if s= "00" then
  y<=a(0);
elsif s="01" then
  y<=a(1);
elsif s="10" then
  y<=a(2);
else
 y<=a(3);
end if;
end process;
end rtl;

