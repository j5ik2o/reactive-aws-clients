// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteResolverRequestBuilderOps(val self: DeleteResolverRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): DeleteResolverRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def typeNameAsScala(value: Option[String]): DeleteResolverRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  final def fieldNameAsScala(value: Option[String]): DeleteResolverRequest.Builder = {
    value.fold(self) { v =>
      self.fieldName(v)
    }
  }

}

final class DeleteResolverRequestOps(val self: DeleteResolverRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def typeNameAsScala: Option[String] = Option(self.typeName)

  final def fieldNameAsScala: Option[String] = Option(self.fieldName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteResolverRequestOps {

  implicit def toDeleteResolverRequestBuilderOps(v: DeleteResolverRequest.Builder): DeleteResolverRequestBuilderOps =
    new DeleteResolverRequestBuilderOps(v)

  implicit def toDeleteResolverRequestOps(v: DeleteResolverRequest): DeleteResolverRequestOps =
    new DeleteResolverRequestOps(v)

}
