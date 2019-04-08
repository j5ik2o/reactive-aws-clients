// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateTypeRequestBuilderOps(val self: UpdateTypeRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): UpdateTypeRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def typeNameAsScala(value: Option[String]): UpdateTypeRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  final def definitionAsScala(value: Option[String]): UpdateTypeRequest.Builder = {
    value.fold(self) { v =>
      self.definition(v)
    }
  }

  final def formatAsScala(value: Option[TypeDefinitionFormat]): UpdateTypeRequest.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

}

final class UpdateTypeRequestOps(val self: UpdateTypeRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def typeNameAsScala: Option[String] = Option(self.typeName)

  final def definitionAsScala: Option[String] = Option(self.definition)

  final def formatAsScala: Option[TypeDefinitionFormat] = Option(self.format)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTypeRequestOps {

  implicit def toUpdateTypeRequestBuilderOps(v: UpdateTypeRequest.Builder): UpdateTypeRequestBuilderOps =
    new UpdateTypeRequestBuilderOps(v)

  implicit def toUpdateTypeRequestOps(v: UpdateTypeRequest): UpdateTypeRequestOps = new UpdateTypeRequestOps(v)

}
