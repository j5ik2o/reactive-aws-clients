// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotFleetRequestConfigBuilderOps(val self: SpotFleetRequestConfig.Builder) extends AnyVal {

  final def activityStatusAsScala(value: Option[ActivityStatus]): SpotFleetRequestConfig.Builder = {
    value.fold(self) { v =>
      self.activityStatus(v)
    }
  }

  final def createTimeAsScala(value: Option[java.time.Instant]): SpotFleetRequestConfig.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  final def spotFleetRequestConfigAsScala(value: Option[SpotFleetRequestConfigData]): SpotFleetRequestConfig.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestConfig(v)
    }
  }

  final def spotFleetRequestIdAsScala(value: Option[String]): SpotFleetRequestConfig.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestId(v)
    }
  }

  final def spotFleetRequestStateAsScala(value: Option[BatchState]): SpotFleetRequestConfig.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestState(v)
    }
  }

}

final class SpotFleetRequestConfigOps(val self: SpotFleetRequestConfig) extends AnyVal {

  final def activityStatusAsScala: Option[ActivityStatus] = Option(self.activityStatus)

  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  final def spotFleetRequestConfigAsScala: Option[SpotFleetRequestConfigData] = Option(self.spotFleetRequestConfig)

  final def spotFleetRequestIdAsScala: Option[String] = Option(self.spotFleetRequestId)

  final def spotFleetRequestStateAsScala: Option[BatchState] = Option(self.spotFleetRequestState)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotFleetRequestConfigOps {

  implicit def toSpotFleetRequestConfigBuilderOps(v: SpotFleetRequestConfig.Builder): SpotFleetRequestConfigBuilderOps =
    new SpotFleetRequestConfigBuilderOps(v)

  implicit def toSpotFleetRequestConfigOps(v: SpotFleetRequestConfig): SpotFleetRequestConfigOps =
    new SpotFleetRequestConfigOps(v)

}
