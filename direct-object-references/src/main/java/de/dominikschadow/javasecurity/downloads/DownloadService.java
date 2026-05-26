/*
 * Copyright (C) 2023 Dominik Schadow, dominikschadow@gmail.com
 *
 * This file is part of the Java Security project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.dominikschadow.javasecurity.downloads;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.owasp.esapi.errors.AccessControlException;
import org.owasp.esapi.reference.RandomAccessReferenceMap;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import java.io.File;
import java.net.MalformedURLException;
import java.util.HashSet;
import java.util.Set;

@Service
@Slf4j
public class DownloadService {

    private final Set<Object> resources = new HashSet<>();

    private final RandomAccessReferenceMap referenceMap = new RandomAccessReferenceMap(resources);

    private final String rootLocation;

    public DownloadService() {
        this.rootLocation = "http://localhost:8080/files/";
    }

    @PostConstruct
    protected void init() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Set<String> getAllIndirectReferences() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    File getFileByIndirectReference(String indirectReference) throws AccessControlException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Resource loadAsResource(String filename) throws MalformedURLException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
