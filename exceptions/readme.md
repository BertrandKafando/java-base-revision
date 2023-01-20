## Gestions Exceptions

```
une classe java qu'on peut capturer et gerer.

Une exception est un événement indésirable ou inattendu, qui se produit pendant
l'exécution d'un programme, c'est-à-dire au moment de l'exécution, qui perturbe le
flux normal des instructions du programme.

```


## Error vs Exeptions

```
Ces objets appartiennent à des classes qui étendent toutes, directement ou indirectement, la classe Throwable (package java.lang). Cette classe est immédiatement étendue par 2 autres classes :

    Exception -ext  RuntimeException   - ArithmeticException (Se produit au niveau de l'application)
   
    Error  -OutOfMemoryError  (s'est produit au niveau de la JVM )


La différence entre une erreur et une exception en Java est :
 >Une Exception en java est un objet erreur généré par une application java qu’on peut attraper et traiter
 >Une Erreur est un objet de type Error qui ne peut être ni traité ni prévu par le programmeur (exemple les erreurs qui sont provoquées par la machine virtuelle java). exple:  OutOfMemoryError
```

## Surveillées et non s

```
surveillés (obligé de traiter): Exception 

>try/catch/finally
>trow 

Non surveillées:  RuntimeException + Error
le compilateur n'indique qu'il y'a une exception à cath



```

## Gestion des exceptions


```
> si on fait le catch de l'exception, l'excecution du programme n'est pas arreté.

> Par contre si l'exception atteint la JVM l'excecution est arreté.

> Dans une application, dans les services on fait le throw et c'est dans les controllers qu'on catch les   exceptions et elles seront par la suite envoyée à l'interface utilisateur

```

## Exception personnalisée

```

```