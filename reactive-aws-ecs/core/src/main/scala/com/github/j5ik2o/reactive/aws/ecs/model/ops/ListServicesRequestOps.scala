// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListServicesRequestBuilderOps(val self: ListServicesRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): ListServicesRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListServicesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListServicesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def launchTypeAsScala(value: Option[LaunchType]): ListServicesRequest.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

  final def schedulingStrategyAsScala(value: Option[SchedulingStrategy]): ListServicesRequest.Builder = {
    value.fold(self) { v =>
      self.schedulingStrategy(v)
    }
  }

}

final class ListServicesRequestOps(val self: ListServicesRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

  final def schedulingStrategyAsScala: Option[SchedulingStrategy] = Option(self.schedulingStrategy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListServicesRequestOps {

  implicit def toListServicesRequestBuilderOps(v: ListServicesRequest.Builder): ListServicesRequestBuilderOps =
    new ListServicesRequestBuilderOps(v)

  implicit def toListServicesRequestOps(v: ListServicesRequest): ListServicesRequestOps = new ListServicesRequestOps(v)

}
