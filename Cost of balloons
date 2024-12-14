process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;                               // Reading input from STDIN
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solveTestCase(data, numberOfStudents, marginIndex, costOfGreen, costOfPurple) {
        let totalOfP1Solved = 0;
        let totalOfP2Solved = 0;
         for (let student = 0 ; student < numberOfStudents ; student++) {
            const [ isP1Solved, isP2Solved ] = data[student + marginIndex].split(" ");
                totalOfP1Solved += isP1Solved === "1" ? 1 : 0;
                totalOfP2Solved += isP2Solved === "1" ? 1 : 0;
         }
         console.log(Math.min(costOfGreen* totalOfP1Solved + costOfPurple * totalOfP2Solved,
         costOfGreen * totalOfP2Solved + costOfPurple * totalOfP1Solved));
}
 
function solve(data) {
    const testCases = parseInt(data[0]);
    let indexOfCosts = 1;
    
    for (let i = 0 ; i < testCases ; i++) {
        const [ costOfGreenStr , costOfPurpleStr ] = data[indexOfCosts].split(" ")
        const costOfGreen = parseInt(costOfGreenStr);
        const costOfPurple = parseInt(costOfPurpleStr);
 
        const numberOfStudents = parseInt(data[indexOfCosts + 1]);
 
        solveTestCase(data, numberOfStudents, indexOfCosts + 2, costOfGreen, costOfPurple);
 
        indexOfCosts += 2 + numberOfStudents; // 2 : line of costs itself and line of #students
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
