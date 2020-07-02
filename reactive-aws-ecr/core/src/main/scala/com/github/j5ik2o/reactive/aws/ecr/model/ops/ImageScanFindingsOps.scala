// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class ImageScanFindingsBuilderOps(val self: ImageScanFindings.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanCompletedAtAsScala(value: Option[java.time.Instant]): ImageScanFindings.Builder = {
    value.fold(self) { v => self.imageScanCompletedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vulnerabilitySourceUpdatedAtAsScala(value: Option[java.time.Instant]): ImageScanFindings.Builder = {
    value.fold(self) { v => self.vulnerabilitySourceUpdatedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def findingsAsScala(value: Option[Seq[ImageScanFinding]]): ImageScanFindings.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.findings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def findingSeverityCountsAsScala(value: Option[Map[FindingSeverity, Int]]): ImageScanFindings.Builder = {
    value
      .filter(_.nonEmpty).map(_.view.map { case (k, v) => (k, v.asInstanceOf[java.lang.Integer]) }.toMap).fold(self) {
        v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.findingSeverityCounts(v.asJava)
      }
  }

}

final class ImageScanFindingsOps(val self: ImageScanFindings) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanCompletedAtAsScala: Option[java.time.Instant] = Option(self.imageScanCompletedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vulnerabilitySourceUpdatedAtAsScala: Option[java.time.Instant] = Option(self.vulnerabilitySourceUpdatedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def findingsAsScala: Option[Seq[ImageScanFinding]] =
    Option(self.findings).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def findingSeverityCountsAsScala: Option[Map[FindingSeverity, Int]] =
    Option(self.findingSeverityCounts).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      v.asScala.toMap.view.map { case (k, v) => (k, v.intValue()) }.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageScanFindingsOps {

  implicit def toImageScanFindingsBuilderOps(v: ImageScanFindings.Builder): ImageScanFindingsBuilderOps =
    new ImageScanFindingsBuilderOps(v)

  implicit def toImageScanFindingsOps(v: ImageScanFindings): ImageScanFindingsOps = new ImageScanFindingsOps(v)

}
