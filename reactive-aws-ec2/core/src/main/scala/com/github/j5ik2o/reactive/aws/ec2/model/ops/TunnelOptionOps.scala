// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TunnelOptionBuilderOps(val self: TunnelOption.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outsideIpAddressAsScala(value: Option[String]): TunnelOption.Builder = {
    value.fold(self) { v => self.outsideIpAddress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tunnelInsideCidrAsScala(value: Option[String]): TunnelOption.Builder = {
    value.fold(self) { v => self.tunnelInsideCidr(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def preSharedKeyAsScala(value: Option[String]): TunnelOption.Builder = {
    value.fold(self) { v => self.preSharedKey(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1LifetimeSecondsAsScala(value: Option[Int]): TunnelOption.Builder = {
    value.fold(self) { v => self.phase1LifetimeSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2LifetimeSecondsAsScala(value: Option[Int]): TunnelOption.Builder = {
    value.fold(self) { v => self.phase2LifetimeSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rekeyMarginTimeSecondsAsScala(value: Option[Int]): TunnelOption.Builder = {
    value.fold(self) { v => self.rekeyMarginTimeSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rekeyFuzzPercentageAsScala(value: Option[Int]): TunnelOption.Builder = {
    value.fold(self) { v => self.rekeyFuzzPercentage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replayWindowSizeAsScala(value: Option[Int]): TunnelOption.Builder = {
    value.fold(self) { v => self.replayWindowSize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dpdTimeoutSecondsAsScala(value: Option[Int]): TunnelOption.Builder = {
    value.fold(self) { v => self.dpdTimeoutSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1EncryptionAlgorithmsAsScala(
      value: Option[Seq[Phase1EncryptionAlgorithmsListValue]]
  ): TunnelOption.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase1EncryptionAlgorithms(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2EncryptionAlgorithmsAsScala(
      value: Option[Seq[Phase2EncryptionAlgorithmsListValue]]
  ): TunnelOption.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase2EncryptionAlgorithms(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1IntegrityAlgorithmsAsScala(
      value: Option[Seq[Phase1IntegrityAlgorithmsListValue]]
  ): TunnelOption.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase1IntegrityAlgorithms(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2IntegrityAlgorithmsAsScala(
      value: Option[Seq[Phase2IntegrityAlgorithmsListValue]]
  ): TunnelOption.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase2IntegrityAlgorithms(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1DHGroupNumbersAsScala(value: Option[Seq[Phase1DHGroupNumbersListValue]]): TunnelOption.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase1DHGroupNumbers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2DHGroupNumbersAsScala(value: Option[Seq[Phase2DHGroupNumbersListValue]]): TunnelOption.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase2DHGroupNumbers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ikeVersionsAsScala(value: Option[Seq[IKEVersionsListValue]]): TunnelOption.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ikeVersions(v.asJava)
    }
  }

}

final class TunnelOptionOps(val self: TunnelOption) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outsideIpAddressAsScala: Option[String] = Option(self.outsideIpAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tunnelInsideCidrAsScala: Option[String] = Option(self.tunnelInsideCidr)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def preSharedKeyAsScala: Option[String] = Option(self.preSharedKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1LifetimeSecondsAsScala: Option[Int] = Option(self.phase1LifetimeSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2LifetimeSecondsAsScala: Option[Int] = Option(self.phase2LifetimeSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rekeyMarginTimeSecondsAsScala: Option[Int] = Option(self.rekeyMarginTimeSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rekeyFuzzPercentageAsScala: Option[Int] = Option(self.rekeyFuzzPercentage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replayWindowSizeAsScala: Option[Int] = Option(self.replayWindowSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dpdTimeoutSecondsAsScala: Option[Int] = Option(self.dpdTimeoutSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1EncryptionAlgorithmsAsScala: Option[Seq[Phase1EncryptionAlgorithmsListValue]] =
    Option(self.phase1EncryptionAlgorithms).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2EncryptionAlgorithmsAsScala: Option[Seq[Phase2EncryptionAlgorithmsListValue]] =
    Option(self.phase2EncryptionAlgorithms).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1IntegrityAlgorithmsAsScala: Option[Seq[Phase1IntegrityAlgorithmsListValue]] =
    Option(self.phase1IntegrityAlgorithms).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2IntegrityAlgorithmsAsScala: Option[Seq[Phase2IntegrityAlgorithmsListValue]] =
    Option(self.phase2IntegrityAlgorithms).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1DHGroupNumbersAsScala: Option[Seq[Phase1DHGroupNumbersListValue]] =
    Option(self.phase1DHGroupNumbers).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2DHGroupNumbersAsScala: Option[Seq[Phase2DHGroupNumbersListValue]] =
    Option(self.phase2DHGroupNumbers).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ikeVersionsAsScala: Option[Seq[IKEVersionsListValue]] =
    Option(self.ikeVersions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTunnelOptionOps {

  implicit def toTunnelOptionBuilderOps(v: TunnelOption.Builder): TunnelOptionBuilderOps = new TunnelOptionBuilderOps(v)

  implicit def toTunnelOptionOps(v: TunnelOption): TunnelOptionOps = new TunnelOptionOps(v)

}
