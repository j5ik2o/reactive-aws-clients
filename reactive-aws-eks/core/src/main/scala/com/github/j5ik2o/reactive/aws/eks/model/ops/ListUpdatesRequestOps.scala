// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ListUpdatesRequestBuilderOps(val self: ListUpdatesRequest.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): ListUpdatesRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListUpdatesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListUpdatesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class ListUpdatesRequestOps(val self: ListUpdatesRequest) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListUpdatesRequestOps {

  implicit def toListUpdatesRequestBuilderOps(v: ListUpdatesRequest.Builder): ListUpdatesRequestBuilderOps =
    new ListUpdatesRequestBuilderOps(v)

  implicit def toListUpdatesRequestOps(v: ListUpdatesRequest): ListUpdatesRequestOps = new ListUpdatesRequestOps(v)

}
