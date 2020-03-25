environments {
    local {
        server {
            hostname = 'localhost'
            sshPort = 2222
            username = 'vagrant'
        }

        tomcat {
            hostname = '193.168.1.33'
            port = 8080
            context = 'todo'
        }
    }
    test {
        server {
            hostname = 'test'
            sshPort = 1111
            username = 'testuser'
        }

        tomcat {
            hostname = '10.0.0.1'
            port = 9090
            context = 'testtodo'
        }
    }
}