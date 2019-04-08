// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class RegisterJobDefinitionResponseBuilderOps(val self: RegisterJobDefinitionResponse.Builder) extends AnyVal {

  final def jobDefinitionNameAsScala(value: Option[String]): RegisterJobDefinitionResponse.Builder = {
    value.fold(self) { v =>
      self.jobDefinitionName(v)
    }
  } // String

  final def jobDefinitionArnAsScala(value: Option[String]): RegisterJobDefinitionResponse.Builder = {
    value.fold(self) { v =>
      self.jobDefinitionArn(v)
    }
  } // String

  final def revisionAsScala(value: Option[Int]): RegisterJobDefinitionResponse.Builder = {
    value.fold(self) { v =>
      self.revision(v)
    }
  } // Int

}

final class RegisterJobDefinitionResponseOps(val self: RegisterJobDefinitionResponse) extends AnyVal {

  final def jobDefinitionNameAsScala: Option[String] = Option(self.jobDefinitionName) // String

  final def jobDefinitionArnAsScala: Option[String] = Option(self.jobDefinitionArn) // String

  final def revisionAsScala: Option[Int] = Option(self.revision) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterJobDefinitionResponseOps {

  implicit def toRegisterJobDefinitionResponseBuilderOps(
      v: RegisterJobDefinitionResponse.Builder
  ): RegisterJobDefinitionResponseBuilderOps = new RegisterJobDefinitionResponseBuilderOps(v)

  implicit def toRegisterJobDefinitionResponseOps(v: RegisterJobDefinitionResponse): RegisterJobDefinitionResponseOps =
    new RegisterJobDefinitionResponseOps(v)

}
