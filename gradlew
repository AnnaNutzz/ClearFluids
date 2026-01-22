#!/bin/bash
# Gradle wrapper script - GitHub Actions will use this

GRADLE_VERSION=8.5
GRADLE_HOME="${HOME}/.gradle/wrapper/dists/gradle-${GRADLE_VERSION}"

exec gradle "$@"
