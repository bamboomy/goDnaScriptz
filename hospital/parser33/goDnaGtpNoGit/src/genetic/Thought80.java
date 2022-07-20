package genetic;
import java.util.ArrayList;
class Thought80 extends Thought{
private static ArrayList<Thought80> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 164.487642404822;
private double fd1 = 855.9088007784258;
private Thought fo0 = null;
private Thought fo1 = null;
Thought80 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought80 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought80 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought80 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought80 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought80 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought80 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought80 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought80 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    Output.points[2][6] -= fd1;
if(fo0 != null){
      fo0.m1();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        fb0 = !fb1;
        boolean lb1 = true;
        for(int i1=0; i1<10; i1++){
            lb0 = !lb1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
            for(int i2=0; i2<10; i2++){
                if (fb0) {
                    fb1 = fd1 < fd0;
                    Thought lo2 = Thought67.getInstance(fo1, fo0, fo1, fo0);
                    lb0 = fd1 < fd0;
if(fo0 != null){
                      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
                    boolean lb3 = false;
                    lb0 = lb1 && fb0;
                    fd1 *= -1;
                    boolean lb4 = false;
                    } else if (lb0) {
}}}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    double ld0 = 566.3274829889933;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    double ld1 = 362.1693231015559;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
    ab4 = ld1 < fd0;
        fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought122.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, fd0);
}
    fb0 = fd1 > ld0;
    ld1 *= -1;
    Thought lo4 = Thought200.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
    Thought lo5 = Thought291.getInstance();
    fb1 = lb2 && ab1;
    boolean lb6 = false;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld0;
    double ld7 = 267.4208963796364;
    fb1 = !lb2;
    ld1 = ld7 - fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        fb0 = ad1 < ad2;
        } else {
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        ad1 *= -1;
        boolean lb0 = false;
if(fo0 != null){
          fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
        double ld1 = 44.78438436817616;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
            fd1 *= -1;
            ld1 *= -1;
if(fo0 != null){
              lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
            ad1 = ad2 + ad3;
            ad4 = fd0 - fd1;
            fb0 = ld1 < ad1;
            double ld2 = 984.5598041135188;
            boolean lb3 = false;
if(fo0 != null){
              fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m2();
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    ad2 *= -1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 < ad4;
    boolean lb1 = true;
    boolean lb2 = true;
    ab4 = fb0 || fb1;
    lb0 = !lb1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 && ab3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        if (fb1) {
            fd0 = fd1 - fd0;
            double ld1 = 118.87692035277803;
if(ao2 != null){
              ao2.m2(fd0, fd1, ld1, fd0);
}
            lb0 = fd1 < ld1;
            fb0 = !fb1;
            double ld2 = 218.73513255111476;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld1);
}
if(ao3 != null){
              ao3.m2();
}
            double ld3 = 962.1280720005681;
            Thought lo4 = Thought255.getInstance(lb0, fb0, fb1, lb0);
if(ao4 != null){
              ld2 = ao4.m3(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
            fb1 = !lb0;
if(ao3 != null){
              ld2 = ao3.m3(ld3, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
            fb1 = ld2 > ld3;
            fd0 *= -1;
            fd1 *= -1;
            Output.points[2][7] -= ld1;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fb1 = ad2 < ad3;
        ad4 = fd0 - fd1;
        ad1 = ad2 + ad3;
        } else {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb0 = ad4 < fd0;
if(ao2 != null){
          ao2.m2(fd1, ad1, ad2, ad3);
}
        fb1 = !fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
        ad2 = ad3 + ad4;
        boolean lb0 = true;
        fd0 = fd1 + ad1;
        for(int i0=0; i0<10; i0++){
            fb0 = !fb1;
if(ao3 != null){
              ao3.m1();
}
            lb0 = ad2 < ad3;
            ad4 = fd0 + fd1;
            ad1 *= -1;
            fb0 = ad2 > ad3;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    double ld0 = 175.85487419094693;
    double ld1 = 514.5553857658339;
    double ld2 = 753.7635927000499;
if(ao2 != null){
      ld0 = ao2.m3(ab1, ab2, ab3, ab4);
}
    fb0 = ld1 < ld2;
    fb1 = fd0 > fd1;
    ab1 = ld0 < ld1;
    ld2 = fd0 + fd1;
    ab2 = ld0 < ld1;
    ab3 = ld2 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ld2, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ld1, ld2, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    boolean lb3 = false;
    Output.points[2][8] -= fd0;
    fd1 = ld0 - ld1;
    ld2 = fd0 - fd1;
    double ld4 = 71.16029559420305;
    double ld5 = 222.7988705227304;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 < ld1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ld2, ld4, ld5, fd0);
}
    Thought lo6 = Thought20.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ld2);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 627.1416832238899;
    ad1 *= -1;
    boolean lb1 = false;
if(ao1 != null){
      ad2 = ao1.m3();
}
if(ao2 != null){
      lb1 = ao2.m2(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
    Thought lo3 = Thought35.getInstance(ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[3][0] -= fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 *= -1;
    Thought lo0 = Thought218.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    double ld0 = 735.4412026947606;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought236.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
    double ld2 = 464.12316421502436;
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ld0 = ld2 + fd0;
    boolean lb3 = true;
    boolean lb4 = true;
    lb4 = fd1 < ld0;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo6 = Thought49.getInstance(ld2, fd0, fd1, ld0);
    lb5 = ab1 || ab2;
    ab3 = !ab4;
    ld2 = fd0 + fd1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ad1 < ad2;
    Thought lo1 = Thought127.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought177.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
    fd0 = fd1 + ad1;
    boolean lb3 = true;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, lb3, lb4, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb3, lb4);
}
    double ld5 = 372.0860130171651;
    boolean lb6 = false;
if(fo1 != null){
      lb6 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ld5, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld5, ad1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    ab4 = fd1 < ad1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    ab1 = fd0 < fd1;
    ad1 = ad2 - ad3;
    Output.points[3][1] += ad4;
    fd0 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ab2 = !ab3;
        boolean lb1 = false;

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought96.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m2();
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought325.getInstance(fb1, fb0, fb1, fb0);
    double ld2 = 249.45976764481406;
    ld2 *= -1;
    fd0 = fd1 + ld2;
    fb1 = fd0 < fd1;
    fb0 = ld2 < fd0;
    double ld3 = 211.42729199389595;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ld3, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - ld2;
    Output.points[3][2] -= ld3;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, ld3, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld2;
    ld3 = fd0 - fd1;
    ld2 = ld3 + fd0;
    boolean lb4 = false;
    fd1 = ld2 + ld3;
    fd0 = fd1 - ld2;
    boolean lb5 = true;

Thought.STACK_COUNTER++;
return lb5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 849.0632758583082;
    fb0 = ad1 > ad2;
    fb1 = !fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    fb0 = ad3 < ad4;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo2 = Thought196.getInstance(fd1, ld0, ad1, ad2);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ld0 = ad1 - ad2;
    ad3 = ad4 - fd0;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][3] -= fd0;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(ao3 != null){
          ao2 = ao3.m4(lb0, ab1, ab2, ab3);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
          ab1 = ao3.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        boolean lb1 = true;
        fb0 = fb1 || lb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        fd1 = fd0 - fd1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        fd0 = fd1 + fd0;
        Thought lo2 = Thought211.getInstance(fd1, fd0, fd1, fd0);
        lb0 = lb1 || ab1;
        Output.points[3][4] += fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        ab2 = !ab3;
        ab4 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4();
}
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    Thought lo0 = Thought8.getInstance(fb0, fb1, ab1, ab2);
    Thought lo1 = Thought31.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;
    fd1 *= -1;
    fb1 = ab1 && ab2;
    ad1 = ad2 - ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[3][5] += ad4;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    ab1 = ad3 < ad4;
    ab2 = fd0 > fd1;
    ad1 *= -1;
    ab3 = !ab4;
    boolean lb2 = true;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 699.0754672847991;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought87.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    Thought lo3 = Thought175.getInstance(ld0, fd0, fd1, ld0);
    double ld4 = 916.123625753447;
    lb2 = ld4 < fd0;
    fb0 = fd1 > ld0;
    ld4 *= -1;
    Thought lo5 = Thought178.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld4);
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb2, fb0, fb1);
}
    double ld6 = 547.4106934130502;
    lb2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld4, ld6, fd0, fb0, fb1, lb2, fb0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = ad3 < ad4;
    fb0 = fb1 && lb0;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fb1 = !lb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    Thought lo2 = Thought11.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    lb0 = lb1 || fb0;
    ad1 = ad2 + ad3;
    fb1 = lb0 || lb1;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
        ab3 = ab4 || fb0;
        ad2 = ad3 + ad4;
        boolean lb0 = true;
        double ld1 = 435.4159238356499;
        boolean lb2 = false;
        ab4 = ad4 > fd0;
        fb0 = fd1 < ld1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad3 = ad4 - fd0;
        fb1 = lb0 && lb2;
if(fo0 != null){
          ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
        fd1 = ld1 + ad1;
        Output.points[3][6] += ad2;
        fb1 = !lb0;
        boolean lb3 = true;
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb3, ab1, ab2, ab3);
}
        ab4 = ld1 < ad1;
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, lb0, lb2, lb3);
}
        double ld4 = 608.3553528228483;
        ab1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
}
Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    fd0 *= -1;
        lb0 = !fb0;
    double ld1 = 309.70717308535944;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought324.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
if(ao4 != null){
      fd1 = ao4.m3(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
    Output.points[3][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb0 = fb0 && fb1;
    Thought lo3 = Thought194.getInstance(fd1, ld1, fd0, fd1);
    lb0 = ld1 < fd0;
    boolean lb4 = false;
    lb4 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    Thought lo5 = Thought101.getInstance();

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought147.getInstance(ao3, ao4, fo0, fo1);
    double ld2 = 282.27717071711743;
if(ao2 != null){
      ao1 = ao2.m4(ld2, ad1, ad2, ad3);
}
    lb0 = fb0 || fb1;
    ad4 *= -1;
    lb0 = fd0 < fd1;
    fb0 = ld2 > ad1;
    ad2 *= -1;
    fb1 = ad3 > ad4;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao2.m2();
}
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao3.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, ad1, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 856.0461039473092;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld1 = 813.3058971493846;
    ab1 = ld0 < ld1;
    double ld2 = 673.198754406308;
    Thought lo3 = Thought275.getInstance(ld2, fd0, fd1, ld0);
    ld1 *= -1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ld1 = ao3.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ld2 > fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    ad1 = ad2 + ad3;
    double ld0 = 161.61519466145296;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought319.getInstance(ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
    boolean lb2 = true;
    Output.points[3][8] += ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
    double ld3 = 50.054845386025306;
    ab1 = !ab2;
    boolean lb4 = true;
    ad4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld5 = 928.5016542114417;
    ab2 = ab3 && ab4;
    Output.points[4][0] -= ad4;
    fb0 = fd0 > fd1;
    Thought lo6 = Thought316.getInstance(ld0, ld3, ld5, ad1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ld0;
if(fo1 != null){
      fo1.m1();
}
        boolean lb7 = false;
if(ao1 != null){
      ao1.m3(lb2, lb4, lb7, ab1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld3, ld5, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought117.getInstance();
    boolean lb1 = true;
    lb1 = fd1 < fd0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
    Thought lo3 = Thought62.getInstance(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
    lb2 = fb0 || fb1;
    lb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = lb1 || lb2;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
    boolean lb0 = true;
    boolean lb1 = true;
    Thought lo2 = Thought265.getInstance(fd1, fd0, fd1, fd0);
    ab1 = ab2 || ab3;
    ab4 = fd1 < fd0;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 = fd0 + fd1;
        Thought lo3 = Thought219.getInstance(fb1, lb0, lb1, ab1);
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 && lb1;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        for(int i0=0; i0<10; i0++){
            ab2 = !ab3;
if(fo0 != null){
              ab4 = fo0.m2(fd0, fd1, fd0, fd1);
}
            fd0 *= -1;
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
            fb1 = lb0 || lb1;
}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fb1 || fb0;
    double ld0 = 583.7398068821221;
    fd0 = fd1 - ld0;
    fb1 = fb0 || fb1;
    Output.points[4][1] -= ad1;
    double ld1 = 978.1119773676495;
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld2 = 510.88517189030784;
    fb0 = fb1 && fb0;
    fd0 *= -1;
    Thought lo3 = Thought202.getInstance(fd1, ld0, ld1, ld2, fb1, fb0, fb1, fb0);
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb4, fb0);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    fd0 = fd1 + ad1;
    fb0 = fb1 && ab1;
    Output.points[4][2] -= ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    double ld1 = 644.9718183954428;
    ab3 = !ab4;
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    ad2 *= -1;
    if (ab4) {
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][3] -= fd1;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld2 = 651.070999072595;
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    double ld3 = 228.82113870370299;
    double ld4 = 37.80342733083134;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ld3, ld4, fd0, lb1, fb0, fb1, lb0);
}
    Thought lo5 = Thought137.getInstance(fd1, ld2, ld3, ld4, lb1, fb0, fb1, lb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + ld2;
    lb1 = ld3 < ld4;
    fd0 = fd1 - ld2;
    fb0 = fb1 || lb0;
if(ao1 != null){
      ld3 = ao1.m3(ao2, ao3, ao4, fo0);
}
    lb1 = fb0 && fb1;
    double ld6 = 28.667186790758066;
if(ao1 != null){
      fo1 = ao1.m4(ld4, ld6, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld2, ld3, ld4, ld6);
}

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 461.3528006668548;
if(ao2 != null){
      ld0 = ao2.m3();
}
    double ld1 = 267.65581735885837;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    ld1 = ad1 + ad2;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ad3 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      fd0 = ao2.m3(lb0, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    double ld1 = 103.20919823902626;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    Output.points[4][4] -= ld1;
    boolean lb2 = true;
    Thought lo3 = Thought231.getInstance(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
    fd0 = fd1 + ld1;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld0 = 116.2244115996826;
    double ld1 = 94.71274355998695;
    ab2 = !ab3;
if(fo1 != null){
      ld1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(ao1 != null){
      ad1 = ao1.m3();
}
    ab4 = ad2 < ad3;
if(ao2 != null){
      ao2.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ad1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, ld1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao3.m3(ld0, ld1, ad1, ad2);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    Output.points[4][5] -= ld0;
    ab2 = ld1 < ad1;
if(ao3 != null){
      ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[4][6] -= fd1;
    boolean lb0 = false;
    Output.points[4][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought212.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 || lb0;
    fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[4][8] += fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    Output.points[5][0] -= fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought397.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb5 = true;
    boolean lb6 = false;
    lb0 = fd1 > fd0;
    boolean lb7 = true;
if(fo0 != null){
      lb1 = fo0.m2();
}
if(fo1 != null){
      fd1 = fo1.m3(lb2, lb3, lb5, lb6);
}
    lb7 = fb0 || fb1;
    lb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb1 = fb0 || fb1;
    double ld0 = 915.1366645040692;
    Output.points[5][1] -= fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    boolean lb1 = true;
    ld0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
    ld0 = fd0 + fd1;
    ld0 *= -1;
    boolean lb2 = false;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[5][2] += ld0;
    fd0 *= -1;
if(fo1 != null){
      lb3 = fo1.m2(fd1, ld0, fd0, fd1);
}
        boolean lb4 = false;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(lb4, fb0, fb1, lb1);
}
        ld0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
