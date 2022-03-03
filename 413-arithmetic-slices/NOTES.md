Arithmetic progression (AP), i.e. a3 - a2 = a2 - a1
Eg: - 1,2,3,4
Code will start from eg[2] to check A.P. 
as 3-2 == 2-1
A.P. is there then in prev we add 1 and and then checck a4- a3 = a3 - a2
as 4 - 3 == 3 - 2 
then prev will add again 1 
if there is no A.P. then it will add 0

For e.g. :- 

1,2,3,4,10:-
                   prev
3 - 2 == 2 - 1 ==>  1
4 - 2 == 2 - 1 ==>  1+1(prev = prev + 1) = 2 ====> A.P. from 2 to 4 and 1 to 4 
10 - 4 != 4 - 3 ==> 0(if != then prev = 0)

then slices = 1+1+0 = 3


