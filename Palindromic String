process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
const isPalindrome = (S) => {
    for(let i=0; i<parseInt(S.length/2); i++) {
        if (S[i] !== S[S.length - 1 - i]) {
            return false;
        }
    }
    return true;
}
 
function solve(data) {
    console.log(isPalindrome(data[0]) ? "YES" : "NO");
    
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
