// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListStackInstancesRequestBuilderOps(val self: ListStackInstancesRequest.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): ListStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def stackInstanceAccountAsScala(value: Option[String]): ListStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.stackInstanceAccount(v)
    }
  }

  final def stackInstanceRegionAsScala(value: Option[String]): ListStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.stackInstanceRegion(v)
    }
  }

}

final class ListStackInstancesRequestOps(val self: ListStackInstancesRequest) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def stackInstanceAccountAsScala: Option[String] = Option(self.stackInstanceAccount)

  final def stackInstanceRegionAsScala: Option[String] = Option(self.stackInstanceRegion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStackInstancesRequestOps {

  implicit def toListStackInstancesRequestBuilderOps(
      v: ListStackInstancesRequest.Builder
  ): ListStackInstancesRequestBuilderOps = new ListStackInstancesRequestBuilderOps(v)

  implicit def toListStackInstancesRequestOps(v: ListStackInstancesRequest): ListStackInstancesRequestOps =
    new ListStackInstancesRequestOps(v)

}
