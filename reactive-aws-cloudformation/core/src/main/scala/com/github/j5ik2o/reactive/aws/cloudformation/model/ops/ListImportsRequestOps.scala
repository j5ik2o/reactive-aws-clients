// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListImportsRequestBuilderOps(val self: ListImportsRequest.Builder) extends AnyVal {

  final def exportNameAsScala(value: Option[String]): ListImportsRequest.Builder = {
    value.fold(self) { v =>
      self.exportName(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): ListImportsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListImportsRequestOps(val self: ListImportsRequest) extends AnyVal {

  final def exportNameAsScala: Option[String] = Option(self.exportName) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListImportsRequestOps {

  implicit def toListImportsRequestBuilderOps(v: ListImportsRequest.Builder): ListImportsRequestBuilderOps =
    new ListImportsRequestBuilderOps(v)

  implicit def toListImportsRequestOps(v: ListImportsRequest): ListImportsRequestOps = new ListImportsRequestOps(v)

}
