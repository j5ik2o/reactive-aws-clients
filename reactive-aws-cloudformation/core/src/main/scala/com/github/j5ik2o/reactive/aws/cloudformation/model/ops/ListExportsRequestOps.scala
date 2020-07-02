// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListExportsRequestBuilderOps(val self: ListExportsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListExportsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListExportsRequestOps(val self: ListExportsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListExportsRequestOps {

  implicit def toListExportsRequestBuilderOps(v: ListExportsRequest.Builder): ListExportsRequestBuilderOps =
    new ListExportsRequestBuilderOps(v)

  implicit def toListExportsRequestOps(v: ListExportsRequest): ListExportsRequestOps = new ListExportsRequestOps(v)

}
