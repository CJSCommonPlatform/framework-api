# Change Log
All notable changes to this project will be documented in this file, which follows the guidelines
on [Keep a CHANGELOG](http://keepachangelog.com/). This project adheres to
[Semantic Versioning](http://semver.org/).

## [Unreleased]

## [2.1.2] - 2018-06-20

### Changed
- Update common bom to 1.27.0 to fix apache tika security issues

## [2.1.1] - 2018-06-20

### Added
- Add pageSize to the EventStream readFrom(...) method

## [2.0.3] - 2018-05-16

### Changed
- Downgraded Jackson version to 2.8.11 to fix bug with single argument constructors

## [2.0.2] - 2018-05-15

### Changed
- Updated common-bom version to 1.25.0 for Jackson version 2.9.5

## [2.0.1] - 2018-03-09

## [2.0.0-M1] - 2018-02-14

### Added
- Exception JsonSchemaValidatonException
- Interface JsonValidationLoggerHelper
- Interface NamedToMediaTypeConverter
- SynchronousDirectAdapterCache interface to remove dependency on implementation in core
- InterceptorContextProvider service provider
- Make all providers consistent as interfaces

## 1.1.0 - 2018-01-17

### Changed
- Added getComponentName to InterceptorContext

## 1.0.0 - 2018-01-15

### Added
- Initial copy of API from microservice original framework project

[Unreleased]: https://github.com/CJSCommonPlatform/framework-api/compare/release-1.0.0...HEAD
[1.0.0]: https://github.com/CJSCommonPlatform/framework-api/commits/release-1.0.0
