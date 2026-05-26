package de.dominikschadow.javasecurity;

import de.dominikschadow.javasecurity.asymmetric.DSA;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.InputStream;
import java.security.*;
import java.security.cert.CertificateException;

public class Keystore {

    private static final String KEYSTORE_PATH = "/samples.ks";

    public static KeyStore loadKeystore(char[] keystorePassword) throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static PrivateKey loadPrivateKey(KeyStore ks, String keyAlias, char[] keyPassword) throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static PublicKey loadPublicKey(KeyStore ks, String keyAlias) throws KeyStoreException, UnrecoverableKeyException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Key loadKey(KeyStore ks, String keyAlias, char[] keyPassword) throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static SecretKeySpec createSecretKeySpec(byte[] key, String algorithm) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
