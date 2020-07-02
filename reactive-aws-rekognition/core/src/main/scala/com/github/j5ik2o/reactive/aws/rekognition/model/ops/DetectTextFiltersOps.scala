// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectTextFiltersBuilderOps(val self: DetectTextFilters.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def wordFilterAsScala(value: Option[DetectionFilter]): DetectTextFilters.Builder = {
    value.fold(self) { v => self.wordFilter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionsOfInterestAsScala(value: Option[Seq[RegionOfInterest]]): DetectTextFilters.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.regionsOfInterest(v.asJava)
    }
  }

}

final class DetectTextFiltersOps(val self: DetectTextFilters) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def wordFilterAsScala: Option[DetectionFilter] = Option(self.wordFilter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionsOfInterestAsScala: Option[Seq[RegionOfInterest]] =
    Option(self.regionsOfInterest).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectTextFiltersOps {

  implicit def toDetectTextFiltersBuilderOps(v: DetectTextFilters.Builder): DetectTextFiltersBuilderOps =
    new DetectTextFiltersBuilderOps(v)

  implicit def toDetectTextFiltersOps(v: DetectTextFilters): DetectTextFiltersOps = new DetectTextFiltersOps(v)

}
