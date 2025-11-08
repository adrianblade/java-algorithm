#ALGORITHMS

# 01 - Breadth First Search

***[en_GB]***

Breadth-first search (BFS) is an algorithm for traversing or searching tree or graph data structures. It starts at the tree root (or some arbitrary node of a graph, sometimes referred to as a 'search key'[1]) and explores the neighbor nodes first, before moving to the next level neighbors.

***[es_ES]***

En Ciencias de la Computación, Búsqueda en anchura es un algoritmo para recorrer o buscar elementos en un grafo (usado frecuentemente sobre árboles). Intuitivamente, se comienza en la raíz (eligiendo algún nodo como elemento raíz en el caso de un grafo) y se exploran todos los vecinos de este nodo. A continuación para cada uno de los vecinos se exploran sus respectivos vecinos adyacentes, y así hasta que se recorra todo el árbol.

Formalmente, BFS es un algoritmo de búsqueda sin información, que expande y examina todos los nodos de un árbol sistemáticamente para buscar una solución. El algoritmo no usa ninguna estrategia heurística.

# 02 - Depth First Search

***[en_GB]***

Depth-first search (DFS) is an algorithm for traversing or searching tree or graph data structures. One starts at the root (selecting some arbitrary node as the root in the case of a graph) and explores as far as possible along each branch before backtracking.

***[es_ES]***

Una Búsqueda en profundidad (en inglés DFS o Depth First Search) es un algoritmo que permite recorrer todos los nodos de un grafo o árbol (teoría de grafos) de manera ordenada, pero no uniforme. Su funcionamiento consiste en ir expandiendo todos y cada uno de los nodos que va localizando, de forma recurrente, en un camino concreto. Cuando ya no quedan más nodos que visitar en dicho camino, regresa (Backtracking), de modo que repite el mismo proceso con cada uno de los hermanos del nodo ya procesado.

****Maze Solver****

***[en_GB]***

There are a number of different maze solving algorithms, that is, automated methods for the solving of mazes. The random mouse, wall follower, Pledge, and Trémaux's algorithms are designed to be used inside the maze by a traveler with no prior knowledge of the maze, whereas the dead-end filling and shortest path algorithms are designed to be used by a person or computer program that can see the whole maze at once.

Mazes containing no loops are known as "simply connected", or "perfect" mazes, and are equivalent to a tree in graph theory. Thus many maze solving algorithms are closely related to graph theory. Intuitively, if one pulled and stretched out the paths in the maze in the proper way, the result could be made to resemble a tree.

***[es_ES]***

Hay una serie de algoritmos de resolución de laberintos. Con un previo conocimiento del laberinto, busca un trayecto más corto y están diseñados para ser utilizados por una persona o un programa informático que pueda ver todo el laberinto a la vez.
Los laberintos que no contienen bucles se conocen como laberintos "simplemente conectados" o "perfectos", y son equivalentes a un árbol en la teoría de grafos. Así, muchos algoritmos de resolución de laberintos están estrechamente relacionados con la teoría de grafos.


# 03 - Shortest Path


Dijkstra

***[en_GB]***

Dijkstra's algorithm is an algorithm for finding the shortest paths between nodes in a graph, which may represent, for example, road networks. It was conceived by computer scientist Edsger W. Dijkstra in 1956 and published three years later.

The algorithm exists in many variants; Dijkstra's original variant found the shortest path between two nodes, but a more common variant fixes a single node as the "source" node and finds shortest paths from the source to all other nodes in the graph, producing a shortest-path tree.

For a given source node in the graph, the algorithm finds the shortest path between that node and every other.It can also be used for finding the shortest paths from a single node to a single destination node by stopping the algorithm once the shortest path to the destination node has been determined. For example, if the nodes of the graph represent cities and edge path costs represent driving distances between pairs of cities connected by a direct road, Dijkstra's algorithm can be used to find the shortest route between one city and all other cities. As a result, the shortest path algorithm is widely used in network routing protocols, most notably IS-IS and Open Shortest Path First (OSPF). It is also employed as a subroutine in other algorithms such as Johnson's.

***[es_ES]***

El algoritmo de Dijkstra, también llamado algoritmo de caminos mínimos, es un algoritmo para la determinación del camino más corto dado un vértice origen al resto de los vértices en un grafo con pesos en cada arista. Su nombre se refiere a Edsger Dijkstra, quien lo describió por primera vez en 1959.

La idea subyacente en este algoritmo consiste en ir explorando todos los caminos más cortos que parten del vértice origen y que llevan a todos los demás vértices; cuando se obtiene el camino más corto desde el vértice origen, al resto de vértices que componen el grafo, el algoritmo se detiene. El algoritmo es una especialización de la búsqueda de costo uniforme, y como tal, no funciona en grafos con aristas de coste negativo (al elegir siempre el nodo con distancia menor, pueden quedar excluidos de la búsqueda nodos que en próximas iteraciones bajarían el costo general del camino al pasar por una arista con costo negativo).

Una de sus aplicaciones más importantes reside en el campo de la telemática, gracias a él, podemos resolver grafos con muchos nodos, los cuales serían muy complicados de hacer sin dicho algoritmo, encontrando así las rutas más cortas entre un origen y todos los destinos en una red.

Bellman Ford 

***[en_GB]***

The Bellman–Ford algorithm is an algorithm that computes shortest paths from a single source vertex to all of the other vertices in a weighted digraph. It is slower than Dijkstra's algorithm for the same problem, but more versatile, as it is capable of handling graphs in which some of the edge weights are negative numbers. The algorithm was first proposed by Alfonso Shimbel in 1955, but is instead named after Richard Bellman and Lester Ford, Jr., who published it in 1958 and 1956, respectively. Edward F. Moore also published the same algorithm in 1957, and for this reason it is also sometimes called the Bellman–Ford–Moore algorithm.

***[es_ES]***

El algoritmo de Bellman-Ford (algoritmo de Bell-End-Ford) genera el camino más corto en un grafo dirigido ponderado (en el que el peso de alguna de las aristas puede ser negativo). El algoritmo de Dijkstra resuelve este mismo problema en un tiempo menor, pero requiere que los pesos de las aristas no sean negativos, salvo que el grafo sea dirigido y sin ciclos. Por lo que el Algoritmo Bellman-Ford normalmente se utiliza cuando hay aristas con peso negativo. Este algoritmo fue desarrollado por Richard Bellman, Samuel End y Lester Ford.

# 04 - Artificial Intelligence

***[en_GB]***

In computer science, A* (pronounced as "A star") is a computer algorithm that is widely used in pathfinding and graph traversal, the process of plotting an efficiently directed path between multiple points, called nodes. It enjoys widespread use due to its performance and accuracy. However, in practical travel-routing systems, it is generally outperformed by algorithms which can pre-process the graph to attain better performance, although other work has found A* to be superior to other approaches

***[es_ES]***

El algoritmo de búsqueda A* (pronunciado "A asterisco" o "A estrella") se clasifica dentro de los algoritmos de búsqueda en grafos. El algoritmo A* encuentra, siempre y cuando se cumplan unas determinadas condiciones, el camino de menor coste entre un nodo origen y uno objetivo.

# 05 - Spanning Trees

***[en_GB]***

Kruskal's algorithm is a minimum-spanning-tree algorithm which finds an edge of the least possible weight that connects any two trees in the forest. It is a greedy algorithm in graph theory as it finds a minimum spanning tree for a connected weighted graph adding increasing cost arcs at each step. This means it finds a subset of the edges that forms a tree that includes every vertex, where the total weight of all the edges in the tree is minimized. If the graph is not connected, then it finds a minimum spanning forest (a minimum spanning tree for each connected component).

create a forest F (a set of trees), where each vertex in the graph is a separate tree
create a set S containing all the edges in the graph
while S is nonempty and F is not yet spanning
remove an edge with minimum weight from S
if the removed edge connects two different trees then add it to the forest F, combining two trees into a single tree
At the termination of the algorithm, the forest forms a minimum spanning forest of the graph. If the graph is connected, the forest has a single component and forms a minimum spanning tree

***[es_ES]***

El algoritmo de Kruskal es un algoritmo de la teoría de grafos para encontrar un árbol recubridor mínimo en un grafo conexo y ponderado. Es decir, busca un subconjunto de aristas que, formando un árbol, incluyen todos los vértices y donde el valor total de todas las aristas del árbol es el mínimo. Si el grafo no es conexo, entonces busca un bosque expandido mínimo (un árbol expandido mínimo para cada componente conexa). El algoritmo de Kruskal es un ejemplo de algoritmo voraz.

Un ejemplo de árbol expandido mínimo. Cada punto representa un vértice, el cual puede ser un árbol por sí mismo. Se usa el Algoritmo para buscar las distancias más cortas (árbol expandido) que conectan todos los puntos o vértices.
Funciona de la siguiente manera:

se crea un bosque B (un conjunto de árboles), donde cada vértice del grafo es un árbol separado
se crea un conjunto C que contenga a todas las aristas del grafo
mientras C es no vacío
eliminar una arista de peso mínimo de C
si esa arista conecta dos árboles diferentes se añade al bosque, combinando los dos árboles en un solo árbol
en caso contrario, se desecha la arista
Al acabar el algoritmo, el bosque tiene un solo componente, el cual forma un árbol de expansión mínimo del grafo.

# 06 - Strongly Connected Components

Kosaraju

***[en_GB]***

n computer science, Kosaraju's algorithm (also known as the Kosaraju–Sharir algorithm) is a linear time algorithm to find the strongly connected components of a directed graph. Aho, Hopcroft and Ullman credit it to an unpublished paper from 1978 by S. Rao Kosaraju. The same algorithm was independently discovered by Micha Sharir and published by him in 1981. It makes use of the fact that the transpose graph (the same graph with the direction of every edge reversed) has exactly the same strongly connected components as the original graph.

***[es_ES]***

Este algoritmo se basa en el hecho de que si invertimos todas las arcos(aristas) de un grafo, las componentes fuermente conexas son las mismas que en el grafo original.

Para hallar las componentes fuermente conexas de un grafo dirigido G :

- Realiza una busqueda en profundidad sobre G y enumera los vértices.
- Construye un nuevo grafo G' invirtiendo la dirección de todo los arco en G.
- Realiza una búsqueda en profundidad sobre G' empezando por el vértice que fue enumerado con el mayor valor de acuerdo a la numeración asignada en el paso (1). Si la búsqueda en profundidad no alcanza todos los vértices, empieza la siguiente búsqueda en profundidad desde el vértice restante enumerado con el mayor valor.
- Cada árbol obtenido luego de la búsqueda en profundidad es una componente fuertemente conexa.

Tarjan

***[en_GB]***

Tarjan's algorithm is an algorithm in graph theory for finding the strongly connected components of a graph. It runs in linear time, matching the time bound for alternative methods including Kosaraju's algorithm and the path-based strong component algorithm. Tarjan's Algorithm is named for its discoverer, Robert Tarjan.

***[es_ES]***

Es un algoritmo de la teoría de grafos para encontrar las componentes fuertemente conexas de un gráfo . A pesar de que lo precede cronológicamente, puede ser visto como una versión mejorada del algoritmo de Kosaraju , y es comparable en eficiencia con el algoritmo de Gabow.

El algoritmo toma un grafo dirigido como entrada, y produce una partición de los vértices del gráfico en las componentes fuertemente conexas del gráfico. 
La idea básica del algoritmo es la siguiente: una búsqueda en profundidad comienza a partir de un nodo inicial cualquiera. Se lleva a cabo una busqueda en profundidad en los nodos que aún no han sido encontrados. La búsqueda no explora cualquier nodo que ya ha sido explorado. Las componentes fuertemente conexas forma los subárboles del árbol de búsqueda.
Los nodos se colocan en una pila en el orden en que se visitan.posteriormente los nodos se toman de la pila y se determina si cada nodo es la raíz de una componente fuertemente conexa.

# 07 - Maximum Flow Problem

***[en_GB]***

The maximum flow problem can be seen as a special case of more complex network flow problems, such as the circulation problem. The maximum value of an s-t flow (i.e., flow from source s to sink t) is equal to the minimum capacity of an s-t cut (i.e., cut severing s from t) in the network, as stated in the max-flow min-cut theorem.

***[es_ES]***

 El algoritmo propone buscar caminos en los que se pueda aumentar el flujo, hasta que se alcance el flujo máximo.La idea es encontrar una ruta de penetración con un flujo positivo neto que una los nodos origen y destino.
