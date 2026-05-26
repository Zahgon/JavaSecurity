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
package de.dominikschadow.javasecurity.logging.home;

import lombok.extern.slf4j.Slf4j;
import org.owasp.security.logging.SecurityMarkers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Simple login controller which returns a success message and logs security relevant events into the log file.
 *
 * @author Dominik Schadow
 */
@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @PostMapping("login")
    public String firstTask(Login login, Model model) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
