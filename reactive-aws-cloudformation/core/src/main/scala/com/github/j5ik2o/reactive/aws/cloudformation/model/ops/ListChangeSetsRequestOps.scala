// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListChangeSetsRequestBuilderOps(val self: ListChangeSetsRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): ListChangeSetsRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): ListChangeSetsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListChangeSetsRequestOps(val self: ListChangeSetsRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListChangeSetsRequestOps {

  implicit def toListChangeSetsRequestBuilderOps(v: ListChangeSetsRequest.Builder): ListChangeSetsRequestBuilderOps =
    new ListChangeSetsRequestBuilderOps(v)

  implicit def toListChangeSetsRequestOps(v: ListChangeSetsRequest): ListChangeSetsRequestOps =
    new ListChangeSetsRequestOps(v)

}
