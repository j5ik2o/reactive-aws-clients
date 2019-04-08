// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListPartsResponseBuilderOps(val self: ListPartsResponse.Builder) extends AnyVal {

  final def abortDateAsScala(value: Option[java.time.Instant]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.abortDate(v)
    }
  } // java.time.Instant

  final def abortRuleIdAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.abortRuleId(v)
    }
  } // String

  final def bucketAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def uploadIdAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  } // String

  final def partNumberMarkerAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.partNumberMarker(v)
    }
  } // Int

  final def nextPartNumberMarkerAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.nextPartNumberMarker(v)
    }
  } // Int

  final def maxPartsAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.maxParts(v)
    }
  } // Int

  final def isTruncatedAsScala(value: Option[Boolean]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  } // Boolean

  final def partsAsScala(value: Option[Seq[Part]]): ListPartsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parts(v.asJava)
    } // Seq[Part]
  }

  final def initiatorAsScala(value: Option[Initiator]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.initiator(v)
    }
  } // Initiator

  final def ownerAsScala(value: Option[Owner]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  } // Owner

  final def storageClassAsScala(value: Option[StorageClass]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // StorageClass

  final def requestChargedAsScala(value: Option[RequestCharged]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // RequestCharged

}

final class ListPartsResponseOps(val self: ListPartsResponse) extends AnyVal {

  final def abortDateAsScala: Option[java.time.Instant] = Option(self.abortDate) // java.time.Instant

  final def abortRuleIdAsScala: Option[String] = Option(self.abortRuleId) // String

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def uploadIdAsScala: Option[String] = Option(self.uploadId) // String

  final def partNumberMarkerAsScala: Option[Int] = Option(self.partNumberMarker) // Int

  final def nextPartNumberMarkerAsScala: Option[Int] = Option(self.nextPartNumberMarker) // Int

  final def maxPartsAsScala: Option[Int] = Option(self.maxParts) // Int

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated) // Boolean

  final def partsAsScala: Option[Seq[Part]] = Option(self.parts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Part]

  final def initiatorAsScala: Option[Initiator] = Option(self.initiator) // Initiator

  final def ownerAsScala: Option[Owner] = Option(self.owner) // Owner

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) // StorageClass

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // RequestCharged

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPartsResponseOps {

  implicit def toListPartsResponseBuilderOps(v: ListPartsResponse.Builder): ListPartsResponseBuilderOps =
    new ListPartsResponseBuilderOps(v)

  implicit def toListPartsResponseOps(v: ListPartsResponse): ListPartsResponseOps = new ListPartsResponseOps(v)

}
