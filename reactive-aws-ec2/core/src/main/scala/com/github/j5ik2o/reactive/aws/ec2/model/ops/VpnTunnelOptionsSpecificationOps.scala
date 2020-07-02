// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpnTunnelOptionsSpecificationBuilderOps(val self: VpnTunnelOptionsSpecification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tunnelInsideCidrAsScala(value: Option[String]): VpnTunnelOptionsSpecification.Builder = {
    value.fold(self) { v => self.tunnelInsideCidr(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def preSharedKeyAsScala(value: Option[String]): VpnTunnelOptionsSpecification.Builder = {
    value.fold(self) { v => self.preSharedKey(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1LifetimeSecondsAsScala(value: Option[Int]): VpnTunnelOptionsSpecification.Builder = {
    value.fold(self) { v => self.phase1LifetimeSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2LifetimeSecondsAsScala(value: Option[Int]): VpnTunnelOptionsSpecification.Builder = {
    value.fold(self) { v => self.phase2LifetimeSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rekeyMarginTimeSecondsAsScala(value: Option[Int]): VpnTunnelOptionsSpecification.Builder = {
    value.fold(self) { v => self.rekeyMarginTimeSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rekeyFuzzPercentageAsScala(value: Option[Int]): VpnTunnelOptionsSpecification.Builder = {
    value.fold(self) { v => self.rekeyFuzzPercentage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replayWindowSizeAsScala(value: Option[Int]): VpnTunnelOptionsSpecification.Builder = {
    value.fold(self) { v => self.replayWindowSize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dpdTimeoutSecondsAsScala(value: Option[Int]): VpnTunnelOptionsSpecification.Builder = {
    value.fold(self) { v => self.dpdTimeoutSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1EncryptionAlgorithmsAsScala(
      value: Option[Seq[Phase1EncryptionAlgorithmsRequestListValue]]
  ): VpnTunnelOptionsSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase1EncryptionAlgorithms(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2EncryptionAlgorithmsAsScala(
      value: Option[Seq[Phase2EncryptionAlgorithmsRequestListValue]]
  ): VpnTunnelOptionsSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase2EncryptionAlgorithms(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1IntegrityAlgorithmsAsScala(
      value: Option[Seq[Phase1IntegrityAlgorithmsRequestListValue]]
  ): VpnTunnelOptionsSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase1IntegrityAlgorithms(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2IntegrityAlgorithmsAsScala(
      value: Option[Seq[Phase2IntegrityAlgorithmsRequestListValue]]
  ): VpnTunnelOptionsSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase2IntegrityAlgorithms(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1DHGroupNumbersAsScala(
      value: Option[Seq[Phase1DHGroupNumbersRequestListValue]]
  ): VpnTunnelOptionsSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase1DHGroupNumbers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2DHGroupNumbersAsScala(
      value: Option[Seq[Phase2DHGroupNumbersRequestListValue]]
  ): VpnTunnelOptionsSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.phase2DHGroupNumbers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ikeVersionsAsScala(
      value: Option[Seq[IKEVersionsRequestListValue]]
  ): VpnTunnelOptionsSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ikeVersions(v.asJava)
    }
  }

}

final class VpnTunnelOptionsSpecificationOps(val self: VpnTunnelOptionsSpecification) extends AnyVal {

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
  final def phase1EncryptionAlgorithmsAsScala: Option[Seq[Phase1EncryptionAlgorithmsRequestListValue]] =
    Option(self.phase1EncryptionAlgorithms).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2EncryptionAlgorithmsAsScala: Option[Seq[Phase2EncryptionAlgorithmsRequestListValue]] =
    Option(self.phase2EncryptionAlgorithms).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1IntegrityAlgorithmsAsScala: Option[Seq[Phase1IntegrityAlgorithmsRequestListValue]] =
    Option(self.phase1IntegrityAlgorithms).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2IntegrityAlgorithmsAsScala: Option[Seq[Phase2IntegrityAlgorithmsRequestListValue]] =
    Option(self.phase2IntegrityAlgorithms).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase1DHGroupNumbersAsScala: Option[Seq[Phase1DHGroupNumbersRequestListValue]] =
    Option(self.phase1DHGroupNumbers).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def phase2DHGroupNumbersAsScala: Option[Seq[Phase2DHGroupNumbersRequestListValue]] =
    Option(self.phase2DHGroupNumbers).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ikeVersionsAsScala: Option[Seq[IKEVersionsRequestListValue]] =
    Option(self.ikeVersions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpnTunnelOptionsSpecificationOps {

  implicit def toVpnTunnelOptionsSpecificationBuilderOps(
      v: VpnTunnelOptionsSpecification.Builder
  ): VpnTunnelOptionsSpecificationBuilderOps = new VpnTunnelOptionsSpecificationBuilderOps(v)

  implicit def toVpnTunnelOptionsSpecificationOps(v: VpnTunnelOptionsSpecification): VpnTunnelOptionsSpecificationOps =
    new VpnTunnelOptionsSpecificationOps(v)

}
