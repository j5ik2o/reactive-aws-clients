// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DetectStackDriftRequestBuilderOps(val self: DetectStackDriftRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): DetectStackDriftRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def logicalResourceIdsAsScala(value: Option[Seq[String]]): DetectStackDriftRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logicalResourceIds(v.asJava)
    } // Seq[String]
  }

}

final class DetectStackDriftRequestOps(val self: DetectStackDriftRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def logicalResourceIdsAsScala: Option[Seq[String]] = Option(self.logicalResourceIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectStackDriftRequestOps {

  implicit def toDetectStackDriftRequestBuilderOps(
      v: DetectStackDriftRequest.Builder
  ): DetectStackDriftRequestBuilderOps = new DetectStackDriftRequestBuilderOps(v)

  implicit def toDetectStackDriftRequestOps(v: DetectStackDriftRequest): DetectStackDriftRequestOps =
    new DetectStackDriftRequestOps(v)

}
