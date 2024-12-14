process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;                               // Reading input from STDIN
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function isVowel(char) {
    return ["A","E","I","O","U","Y"].includes(char);
}
 
function solve(data) {
    let S = data[0];
    let isValid = true;
    for (let i= 0; i < S.length ;i++) {
        const firstChar = parseInt(S[i]);
        const secondChar =  i == S.length - 1 ? parseInt(S[i]) : parseInt(S[i + 1]);
        if (Number.isNaN(firstChar)) {
            if (isVowel(S[i])) {
                isValid = false;
                break;
            };
        } else {
            if (!Number.isNaN(secondChar) && ((firstChar + secondChar) % 2 !== 0)) {
                isValid = false;
                break;
            }
        }
    }
 
    return isValid ? "valid" : "invalid";
}
 
function main(input) {
    const data = input.split("\n");
    console.log(solve(data))
}
