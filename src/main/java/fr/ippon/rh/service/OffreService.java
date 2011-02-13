package fr.ippon.rh.service;

import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.stereotype.Service;

/**
 * Service d'offres d'emploi.
 */
@Service
public class OffreService {

    private static final String offreEnCours = "R/u73W6/sKY8lokPhnrmgZDDhWXrZ7YHekJOUfS+iC1qjfnl1v+dAQiKyzwpzXxFLKqXv41zrR1Ey3UhXQGxaVWyxNT2HdOaxveZJz0bTPPsXAcsNMQiEBRQxzrjulRPfryFbV92dzhLypYCDBBuuxJFinowiFncDlaTgQlquxRMbOjZdXkzdZOAbVew4E4whGqmoi9yrnbkfOGLzPpuDUG5RgiP0lwOGP5zcgEDRMfUwfqpleWFN0GhwrDtMfG3VbDOUAx5pGORNlAd+wVjSIvhmmPwzsJMMO8z1RXfdpcZVXa+n8O5E+7GOCOd1+wtredkas2oz7QTB8vAwxHxTNsmAO31kxSTe4EBfpPDqNYvKEkd6OVT1QfT0PD9CJ5H2BtcUYj0kRUfUtV1Kkfdz9FsQ+JJyfGnuYpFUVJpDIkEiuX1KVceSmWiwSeMYy2Hd/jEsZPr0dzdNn7oSqWph2R4H6CnVVi8DCPnWjGrzrrjOWGBnftSTGFjBP2hku/0CbHJI+U0R0f10rHK3oRYxtTSL9LO9G8rV4oAHvj04sHXJUzPHxwvB7oOqSSwP2AkECG4ga8sY6ZYd9td1WbK51iM6iJoFGkNhzhEM9GiYnagAyiSYibJ2gQIjpFCVnmmnv0gSyppo/i2M1jTS9V6b27LSXG88OKE17p0bjDd3qwKf6r0rOe9zqFqgqmawxT58eb+ZsSDIWTkmyYPD/fIQW8Aw/xxg2N3ZPrFLARWUgnwJycZW9qYd4Qp0ahRZewVqmaHEpIlb6/L2x35VKE50jk4TXJAxK0xPbswc2R2Nx3ZkcgocwaZrKfhN+hZNXHdOoCgX89CyaXrBGn0vmoHYIXqsFVU8P8qAO5zbnb0iDO3BDL9wgvbmV70w5NBp2Z0Lhwo5Fch/ktAMJdB1EhFyCLUO2jeaifc2Y9Ns+C7HfU5JFrOr3vH49Hb4P5qRlV8bVdjPADDTG4RQE2xBi+JVMZlL2+LKSwdLHRzMMzrJGgTyToo2c09qGhsUwXg3PDZzanGfTfALj3nuoaA6BNXIZJn7SF6R7CGkOZAyWsPhpOihjGYn46m26ZTqze+cVoNQKCwYxdhi4OKOv9l8iUr8iucm5y/obLi+DNoZDYK/Hqu2tfAMfwqX5HTyNLyGrLfQPagNPY/wec/1wKfSUpAHL56TmF4dgqR/TKhizngmdrjLXY0nk8RF4lP/hTJCCTC3eClQl8Vf994bIfk5MB4n5Zau4ixj4KKYaQlYG2Av26T75MoVfSokmcv1O1ENsfY";
    private static final String password = "Ippon Technologies";

    /**
     * Donne une offre d'emploi.
     */
    public String getOffre() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(password);
        return textEncryptor.decrypt(offreEnCours);
    }
}
