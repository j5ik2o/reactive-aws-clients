// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotFleetRequestConfigBuilderOps(val self: SpotFleetRequestConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activityStatusAsScala(value: Option[ActivityStatus]): SpotFleetRequestConfig.Builder = {
    value.fold(self) { v =>
      self.activityStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala(value: Option[java.time.Instant]): SpotFleetRequestConfig.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestConfigAsScala(value: Option[SpotFleetRequestConfigData]): SpotFleetRequestConfig.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdAsScala(value: Option[String]): SpotFleetRequestConfig.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestStateAsScala(value: Option[BatchState]): SpotFleetRequestConfig.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestState(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): SpotFleetRequestConfig.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class SpotFleetRequestConfigOps(val self: SpotFleetRequestConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activityStatusAsScala: Option[ActivityStatus] = Option(self.activityStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestConfigAsScala: Option[SpotFleetRequestConfigData] = Option(self.spotFleetRequestConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdAsScala: Option[String] = Option(self.spotFleetRequestId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestStateAsScala: Option[BatchState] = Option(self.spotFleetRequestState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotFleetRequestConfigOps {

  implicit def toSpotFleetRequestConfigBuilderOps(v: SpotFleetRequestConfig.Builder): SpotFleetRequestConfigBuilderOps =
    new SpotFleetRequestConfigBuilderOps(v)

  implicit def toSpotFleetRequestConfigOps(v: SpotFleetRequestConfig): SpotFleetRequestConfigOps =
    new SpotFleetRequestConfigOps(v)

}
