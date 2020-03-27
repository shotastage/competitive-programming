import Foundation
import Glibc

public func solution(_ N : Int) -> Int {    
    var previousGapCount = 0
    var currentGapCount = 0
    

    for char in String(N, radix: 2) {
        if char == "1" {
            if currentGapCount > previousGapCount {
                previousGapCount = currentGapCount
            }
            
            currentGapCount = 0
        }

        if char == "0" {
            currentGapCount += 1
        }
    }
    
    return previousGapCount
}

