// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class PlatformProgrammingLanguageBuilderOps(val self: PlatformProgrammingLanguage.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): PlatformProgrammingLanguage.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def versionAsScala(value: Option[String]): PlatformProgrammingLanguage.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  } // String

}

final class PlatformProgrammingLanguageOps(val self: PlatformProgrammingLanguage) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def versionAsScala: Option[String] = Option(self.version) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlatformProgrammingLanguageOps {

  implicit def toPlatformProgrammingLanguageBuilderOps(
      v: PlatformProgrammingLanguage.Builder
  ): PlatformProgrammingLanguageBuilderOps = new PlatformProgrammingLanguageBuilderOps(v)

  implicit def toPlatformProgrammingLanguageOps(v: PlatformProgrammingLanguage): PlatformProgrammingLanguageOps =
    new PlatformProgrammingLanguageOps(v)

}
