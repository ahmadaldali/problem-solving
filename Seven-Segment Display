process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
const matchSticksArr = [6, 2, 5, 5, 4, 5, 6, 3, 7, 6];
 
function solveTestCase(n) {
    let totalMatchStick=0;
    totalMatchStick += n.split("").reduce((sum, digit) => {
        return sum + matchSticksArr[parseInt(digit)];
    }, 0);
    
    let numberOf1 = 0;
    if (totalMatchStick % 2 == 0) {
        numberOf1 = totalMatchStick/2;
        console.log('1'.repeat(numberOf1))
    } else {
        numberOf1 = (totalMatchStick - 3 )/2;
        console.log('7'+'1'.repeat(numberOf1))
    }
}
 
function solve(data) {
    const testCases = parseInt(data[0]);
    for (let i = 1; i <= testCases; i++) {
        const n = data[i];
        solveTestCase(n);
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
