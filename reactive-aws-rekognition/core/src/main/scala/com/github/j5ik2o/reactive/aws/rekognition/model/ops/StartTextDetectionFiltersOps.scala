// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartTextDetectionFiltersBuilderOps(val self: StartTextDetectionFilters.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def wordFilterAsScala(value: Option[DetectionFilter]): StartTextDetectionFilters.Builder = {
    value.fold(self) { v =>
      self.wordFilter(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionsOfInterestAsScala(value: Option[Seq[RegionOfInterest]]): StartTextDetectionFilters.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.regionsOfInterest(v.asJava)
    }
  }

}

final class StartTextDetectionFiltersOps(val self: StartTextDetectionFilters) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def wordFilterAsScala: Option[DetectionFilter] = Option(self.wordFilter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionsOfInterestAsScala: Option[Seq[RegionOfInterest]] = Option(self.regionsOfInterest).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartTextDetectionFiltersOps {

  implicit def toStartTextDetectionFiltersBuilderOps(
      v: StartTextDetectionFilters.Builder
  ): StartTextDetectionFiltersBuilderOps = new StartTextDetectionFiltersBuilderOps(v)

  implicit def toStartTextDetectionFiltersOps(v: StartTextDetectionFilters): StartTextDetectionFiltersOps =
    new StartTextDetectionFiltersOps(v)

}
