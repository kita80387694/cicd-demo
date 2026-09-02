# CI/CD Demo

This project is the standalone implementation for the Continuous Integration Workshop.

## Run locally

Windows PowerShell:

```powershell
$env:JAVA_HOME = 'C:\Program Files\Java\latest\jdk-25'
$env:Path = "$env:JAVA_HOME\bin;$env:Path"
.\mvnw.cmd clean test
.\mvnw.cmd package -DskipTests
& "$env:JAVA_HOME\bin\java.exe" -jar target\cicd-demo-0.0.1-SNAPSHOT.jar
```

The application listens on port 5000 by default:

- `GET /` - health check
- `GET /version` - version information
- `GET /nations` - 10 random nations
- `GET /currencies` - 20 random currencies

The JaCoCo HTML report is generated at `target/site/jacoco/index.html` in CI. On
Windows, if the project is stored under a path containing non-ASCII characters, use
the CI job or copy the project to an ASCII-only path for the local HTML report.

## Workshop status

- Spring Boot REST API: complete
- JUnit tests: complete
- JaCoCo coverage: configured
- GitHub Actions: Maven test workflow configured
- SonarCloud and Snyk: manual quality workflow configured; account/token setup required
- Railway and Docker: optional

## Optional quality scans

The `Quality and security scans` workflow is intentionally manual because both
services require your own accounts and secrets. In the GitHub repository, add these
Actions secrets:

- `SONAR_TOKEN`
- `SNYK_TOKEN`

Also add these repository variables under **Settings > Secrets and variables > Actions**:

- `SONAR_ORGANIZATION`
- `SONAR_PROJECT_KEY`

Then open **Actions > Quality and security scans > Run workflow**.
