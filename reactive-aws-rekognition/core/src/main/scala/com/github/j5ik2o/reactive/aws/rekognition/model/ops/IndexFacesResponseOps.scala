// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class IndexFacesResponseBuilderOps(val self: IndexFacesResponse.Builder) extends AnyVal {

  final def faceRecordsAsScala(value: Option[Seq[FaceRecord]]): IndexFacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.faceRecords(v.asJava)
    }
  }

  final def orientationCorrectionAsScala(value: Option[OrientationCorrection]): IndexFacesResponse.Builder = {
    value.fold(self) { v =>
      self.orientationCorrection(v)
    }
  }

  final def faceModelVersionAsScala(value: Option[String]): IndexFacesResponse.Builder = {
    value.fold(self) { v =>
      self.faceModelVersion(v)
    }
  }

  final def unindexedFacesAsScala(value: Option[Seq[UnindexedFace]]): IndexFacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.unindexedFaces(v.asJava)
    }
  }

}

final class IndexFacesResponseOps(val self: IndexFacesResponse) extends AnyVal {

  final def faceRecordsAsScala: Option[Seq[FaceRecord]] = Option(self.faceRecords).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def orientationCorrectionAsScala: Option[OrientationCorrection] = Option(self.orientationCorrection)

  final def faceModelVersionAsScala: Option[String] = Option(self.faceModelVersion)

  final def unindexedFacesAsScala: Option[Seq[UnindexedFace]] = Option(self.unindexedFaces).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIndexFacesResponseOps {

  implicit def toIndexFacesResponseBuilderOps(v: IndexFacesResponse.Builder): IndexFacesResponseBuilderOps =
    new IndexFacesResponseBuilderOps(v)

  implicit def toIndexFacesResponseOps(v: IndexFacesResponse): IndexFacesResponseOps = new IndexFacesResponseOps(v)

}
