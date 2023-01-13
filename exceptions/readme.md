## Gestions Exceptions

```
une classe java qu'on peut capturer et gerer.

Une exception est un événement indésirable ou inattendu, qui se produit pendant
l'exécution d'un programme, c'est-à-dire au moment de l'exécution, qui perturbe le
flux normal des instructions du programme.

```


## Error vs Exeptions

```
Ces objets appartiennent à des classes qui étendent toutes, directement ou indirectement, la classe Throwable (package java.lang). Cette classe est immédiatement étendue par trois autres classes :

    Exception
    RuntimeException   - ArithmeticException
    Error  -OutOfMemoryError


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

```


## Exception personnalisée

```

```