#O(w*h) time
#O(w*h) same space.
def riverSizes(matrix):
    sizes = []
    visited = [[False for value in row] for row in matrix]
    print(visited)
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            #if node has True for visited... skip it.
            if(visited[i][j]):
                continue
            traverseNode(i, j, matrix, visited, sizes)
    return sizes 

def traverseNode(i, j, matrix, visited, sizes):
    currentRiverSize = 0
    nodesToExplore =[[i, j]] #explore the node at i j (essentially x and y coordinates for the location of the value)
    while len(nodesToExplore):
        currentNode = nodesToExplore.pop()
        i = currentNode[0]
        j = currentNode[1]

        if (visited[i][j]): #if i,j has been visited...
            continue
        visited[i][j] = True # else, set it to visited in the visited matrix.

        if(matrix[i][j]==0): # if the value is 0, then it's land, so skip it.
            continue
        currentRiverSize +=1 #else, it's a 1 for river, so expand the current river size.
        unvisitedNeighbors = getUnvisitedNeighbors(i, j, matrix, visited) #then get unvisited neighbors.
        for neighbor in unvisitedNeighbors:
            nodesToExplore.append(neighbor)

        if currentRiverSize > 0:
            sizes.append(currentRiverSize)

def getUnvisitedNeighbors(i, j, matrix, visited):
    unvisitedNeighbors = []
    if i > 0 and not visited[i -1][j]:
        unvisitedNeighbors.append([i-1, j])
    if i < len(matrix) -1 and not visited[i+1][j]:
        unvisitedNeighbors.append([i+1, j])
    if j > 0 and not visited [i][j-1]:
        unvisitedNeighbors.append([i, j -1])
    if j < len(matrix[0]) - 1 and not visited[i][j +1]:
        unvisitedNeighbors.append([i, j+1])
    return unvisitedNeighbors

# riverSizes([[1,0,0,0],[1,0,1,0], [0,1,1,1]])
print(riverSizes([[1,0,0,0],[1,0,1,0], [0,1,1,1]]))
# [1,0,0,0] #2, 4
# [1,0,1,0] 
# [0,1,1,1]