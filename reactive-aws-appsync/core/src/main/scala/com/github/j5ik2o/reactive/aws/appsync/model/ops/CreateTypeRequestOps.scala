// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateTypeRequestBuilderOps(val self: CreateTypeRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): CreateTypeRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def definitionAsScala(value: Option[String]): CreateTypeRequest.Builder = {
    value.fold(self) { v =>
      self.definition(v)
    }
  }

  final def formatAsScala(value: Option[TypeDefinitionFormat]): CreateTypeRequest.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

}

final class CreateTypeRequestOps(val self: CreateTypeRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def definitionAsScala: Option[String] = Option(self.definition)

  final def formatAsScala: Option[TypeDefinitionFormat] = Option(self.format)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTypeRequestOps {

  implicit def toCreateTypeRequestBuilderOps(v: CreateTypeRequest.Builder): CreateTypeRequestBuilderOps =
    new CreateTypeRequestBuilderOps(v)

  implicit def toCreateTypeRequestOps(v: CreateTypeRequest): CreateTypeRequestOps = new CreateTypeRequestOps(v)

}
