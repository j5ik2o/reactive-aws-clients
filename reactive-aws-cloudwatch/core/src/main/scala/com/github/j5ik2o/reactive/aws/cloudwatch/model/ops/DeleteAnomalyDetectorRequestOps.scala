// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DeleteAnomalyDetectorRequestBuilderOps(val self: DeleteAnomalyDetectorRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): DeleteAnomalyDetectorRequest.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala(value: Option[String]): DeleteAnomalyDetectorRequest.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala(value: Option[Seq[Dimension]]): DeleteAnomalyDetectorRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dimensions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statAsScala(value: Option[String]): DeleteAnomalyDetectorRequest.Builder = {
    value.fold(self) { v =>
      self.stat(v)
    }
  }

}

final class DeleteAnomalyDetectorRequestOps(val self: DeleteAnomalyDetectorRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala: Option[String] = Option(self.namespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala: Option[String] = Option(self.metricName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statAsScala: Option[String] = Option(self.stat)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAnomalyDetectorRequestOps {

  implicit def toDeleteAnomalyDetectorRequestBuilderOps(
      v: DeleteAnomalyDetectorRequest.Builder
  ): DeleteAnomalyDetectorRequestBuilderOps = new DeleteAnomalyDetectorRequestBuilderOps(v)

  implicit def toDeleteAnomalyDetectorRequestOps(v: DeleteAnomalyDetectorRequest): DeleteAnomalyDetectorRequestOps =
    new DeleteAnomalyDetectorRequestOps(v)

}
