process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
const INVALID_INPUT = "Invalid Input";
const INVALID_TEST = "Invalid Test";
 
 
function isLower(asciiCode) {
    return asciiCode >= 97 && asciiCode <= 122;
}
 
function isUpper(asciiCode) {
    return asciiCode >= 65 && asciiCode <= 90;
}
 
function getNumberOfOperations(s) {
    if (s.length === 0 || s.length > 100) {
        return INVALID_INPUT
    }
 
    let numberOfUpperCases = 0
    let numberOfLowerCases = 0;
 
    for (let i=0;i<s.length;i++) {
        const asciiCode = s.charCodeAt(i);
        if (isLower(asciiCode)) {
            numberOfLowerCases++;
        } else {
            if (isUpper(asciiCode)) {
                numberOfUpperCases++;
            }
        }
    }
 
    if (numberOfUpperCases === 0 && numberOfLowerCases ===0) {
        return INVALID_INPUT;
    }
    
    return Math.min(numberOfLowerCases, numberOfUpperCases);
}
 
function solve(data) {
    const T = parseInt(data[0]);
    
    if (T === 0 || T > 10 || isNaN(T)) {
        console.log(INVALID_TEST);
        return;
    }
 
    for (let i= 1; i <= T ;i++) {
        console.log(getNumberOfOperations(data[i]))
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
