process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
const TIME_RATE = 5; // Define the time rate constant
 
function isAlphaNumeric(key) {
    return /^[a-zA-Z0-9]+$/.test(key); // Regular expression check for alphanumeric
}
 
function solve(data) {
    const usersMap = new Map();
    const keys = [];
 
    const N = parseInt(data[0]);
    for (let i = 1; i <= N; i++) {
        const [timeStr, url, key, userIdStr] = data[i].split(" ");
        const time = parseInt(timeStr);
        const userId = parseInt(userIdStr);
        let isYes = false;
 
        if (url.startsWith("http://") || url.startsWith("https://")) {
            if (key.length <= 12 && key.length >= 2 && isAlphaNumeric(key)) {
                if (!keys.includes(key)) {
                    const userTriedBefore = usersMap.get(userId);
                    if (!userTriedBefore || (time - userTriedBefore >= TIME_RATE)) {
                        usersMap.set(userId, time);
                        keys.push(key);
                        isYes = true;
                    }
                }
            }
        }
 
        console.log(isYes ? "YES" : "NO");
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
