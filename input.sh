> input.txt
echo "Input whole numbers or END to end the program:"
continue=true;
while [ "$continue" = true ] ; do
read input
echo "$input" >> input.txt
if [ "$input" = "END" ] ; then
java bashInput < input.txt > output.txt
break
fi
done
echo ""
cat output.txt