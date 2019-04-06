// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateTypeRequestBuilderOps(val self: UpdateTypeRequest.Builder) extends AnyVal {

  final def withApiIdAsScala(value: Option[String]): UpdateTypeRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def withTypeNameAsScala(value: Option[String]): UpdateTypeRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  } // String

  final def withDefinitionAsScala(value: Option[String]): UpdateTypeRequest.Builder = {
    value.fold(self) { v =>
      self.definition(v)
    }
  } // String

  final def withFormatAsScala(value: Option[TypeDefinitionFormat]): UpdateTypeRequest.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  } // String

}

final class UpdateTypeRequestOps(val self: UpdateTypeRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def typeNameAsScala: Option[String] = Option(self.typeName) // String

  final def definitionAsScala: Option[String] = Option(self.definition) // String

  final def formatAsScala: Option[TypeDefinitionFormat] = Option(self.format) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTypeRequestOps {

  implicit def toUpdateTypeRequestBuilderOps(v: UpdateTypeRequest.Builder): UpdateTypeRequestBuilderOps =
    new UpdateTypeRequestBuilderOps(v)

  implicit def toUpdateTypeRequestOps(v: UpdateTypeRequest): UpdateTypeRequestOps = new UpdateTypeRequestOps(v)

}
