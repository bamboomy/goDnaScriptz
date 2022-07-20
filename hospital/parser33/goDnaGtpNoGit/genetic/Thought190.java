package genetic;
import java.util.ArrayList;
class Thought190 extends Thought{
private static ArrayList<Thought190> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 869.4315861704717;
private double fd1 = 800.0536877768513;
private Thought fo0 = null;
private Thought fo1 = null;
Thought190 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought190 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought190 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought190 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought190 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought190 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought190 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought190 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought190 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought190 instance = new Thought190 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought190 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought190 instance = new Thought190 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought190 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought190 instance = new Thought190 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought190 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought190 instance = new Thought190 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought190 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought190 instance = new Thought190 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought190 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought190 instance = new Thought190 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought190 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought190 instance = new Thought190 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought190 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought190 instance = new Thought190 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    double ld0 = 500.46930242220486;
    fb0 = !fb1;
        fd0 = fd1 - ld0;
    fb0 = !fb1;
    double ld1 = 118.2096052216214;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
        double ld2 = 836.6240784023059;
        ld0 = ld1 + fd0;
        double ld3 = 192.20565114189898;
        boolean lb4 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, ld3);
}
        Thought lo5 = Thought6.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
if(fo1 != null){
          fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb4, fb0);
}
        fb1 = ld2 > ld3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, lb4, fb0, fb1, lb4);
}
}
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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
    ab3 = fd1 > fd0;
    double ld0 = 913.1957075112832;
    fd0 *= -1;
    fd1 = ld0 - fd0;
    ab4 = fd1 < ld0;
    fb0 = !fb1;
    double ld1 = 169.27826610290046;
    ab1 = ld1 > fd0;
    ab2 = fd1 > ld0;
    ab3 = !ab4;
    ld1 = fd0 - fd1;
    Thought lo2 = Thought41.getInstance(ld0, ld1, fd0, fd1, fb0, fb1, ab1, ab2);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ad1);
}
    fb1 = lb0 && fb0;
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    if (lb0) {
        } else {
        boolean lb1 = false;
if(fo0 != null){
          fo0.m2();
}
if(fo1 != null){
          lb0 = fo1.m2(fb0, fb1, lb1, lb0);
}
        ad3 = ad4 - fd0;
        Thought lo2 = Thought243.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb1, lb0);
                ad4 = fd0 + fd1;
        fb0 = fb1 && lb1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb1);
}
}
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
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    double ld1 = 42.60587333257053;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    double ld2 = 383.0452628891561;
    Output.points[4][1] += ad4;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, ld2, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    Output.points[4][2] -= ad1;
        ab2 = ad2 > ad3;

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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought165.getInstance(fo1, ao1, ao2, ao3);
    fb1 = fd1 < fd0;
if(ao4 != null){
      fb0 = ao4.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld1 = 79.59244037219399;
    double ld2 = 369.4462844422605;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(ld2, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ld2 *= -1;
    fb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    fb0 = fd1 < ld1;
    Output.points[4][3] += ld2;
    fb1 = fb0 && fb1;
    Output.points[4][4] -= fd0;

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
    Thought lo0 = Thought8.getInstance(ad2, ad3, ad4, fd0);
    double ld1 = 351.58423675067473;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        ld1 = ad1 + ad2;
        boolean lb2 = false;
        ad3 *= -1;
        ad4 *= -1;
        }
    double ld3 = 993.7992016122539;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4();
}
        Thought lo4 = Thought95.getInstance(fb1, fb0, fb1, fb0);
        boolean lb5 = false;
        fb0 = fb1 || lb5;
        double ld6 = 73.21103017093863;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ld3, ad1, ad2, fb0, fb1, lb5, fb0);
}
        boolean lb7 = false;
}
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
    ab1 = ab2 || ab3;
    double ld0 = 168.79232606188515;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m1(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
        boolean lb1 = true;
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fb1 = fd1 > ld0;
        Thought lo2 = Thought99.getInstance(ao1, ao2, ao3, ao4);
        lb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo1.m2();
}
if(ao1 != null){
          ao1.m2(ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb1;
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb1;
        fd0 = fd1 - ld0;
        ab1 = fd0 < fd1;
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
        lb1 = ld0 > fd0;
        Thought lo3 = Thought119.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
}
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
    boolean lb0 = true;
    ab1 = ad1 < ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao3.m2(fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    lb0 = lb1 || ab1;
    ab2 = fd1 > ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought3.getInstance(fo0, fo1, ao1, ao2, lb0, lb1, ab1, ab2);

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
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld0 = 78.41445071259204;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - ld0;
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought238.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    Thought lo3 = Thought51.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
    ld0 = fd0 - fd1;
    Output.points[4][5] += ld0;
    for(int i0=0; i0<10; i0++){
        fb1 = lb2 || fb0;
        Thought lo4 = Thought255.getInstance(fo1, fo0, fo1, fo0);
        boolean lb5 = false;
        if (fb0) {
if(fo1 != null){
              fb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
}}
Thought.STACK_COUNTER++;
return lb2;
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
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        ab2 = !ab3;
        ab4 = fb0 && fb1;
if(fo1 != null){
          fo1.m1();
}
        double ld0 = 417.3724728210558;
        ld0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
        Output.points[4][6] += fd1;
if(fo1 != null){
          ld0 = fo1.m3(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 < ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        fd0 *= -1;
        boolean lb1 = true;
        ab2 = ab3 || ab4;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        fb0 = fd1 < ld0;
        Output.points[4][7] -= fd0;
if(fo1 != null){
          fb1 = fo1.m2(fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
        Output.points[4][8] += ld0;
        lb1 = fd0 < fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
}
Thought.STACK_COUNTER++;
return ab2;
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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fb1 = !fb0;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought254.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    fd1 = ad1 + ad2;
    lb0 = ad3 < ad4;
if(fo0 != null){
          fd0 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    double ld3 = 25.910532091242725;

Thought.STACK_COUNTER++;
return lb2;
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
    ad2 *= -1;
    ab1 = !ab2;
    boolean lb0 = false;
if(fo0 != null){
      ab2 = fo0.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought193.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
    ab4 = ad1 > ad2;
    fb0 = ad3 > ad4;
    Thought lo2 = Thought248.getInstance(fo1, fo0, fo1, fo0);
    Thought lo3 = Thought82.getInstance(fd0, fd1, ad1, ad2);
    boolean lb4 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    Thought lo5 = Thought308.getInstance();
    fd0 = fd1 - ad1;
    double ld6 = 928.5426855485258;
    boolean lb7 = true;
    Thought lo8 = Thought193.getInstance(lb0, lb4, lb7, ab1);

Thought.STACK_COUNTER++;
return ab2;
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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 625.1878747051001;
        ld0 = fd0 + fd1;
        ld0 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Output.points[5][0] += fd0;
if(ao1 != null){
      fb1 = ao1.m2();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 157.3918168446129;
    Output.points[5][1] += ld0;
    ad1 = ad2 + ad3;
    fb0 = !fb1;
    Output.points[5][2] += ad4;
    fd0 = fd1 + ld0;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Output.points[5][3] += ad1;
    fb1 = fb0 && fb1;
    fb0 = ad2 < ad3;
    fb1 = !fb0;
    Output.points[5][4] -= ad4;
        fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    Thought lo0 = Thought35.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought244.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb2);
}
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb3 = true;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m3();
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    lb2 = fd0 > fd1;
    lb3 = ab1 && ab2;
    Thought lo4 = Thought145.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb2, lb3, ab1, ab2);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    double ld1 = 949.5500773205176;
    Output.points[5][5] += ld1;
    ab1 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
    ab1 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ad1);
}
    boolean lb2 = true;
    ad2 = ad3 - ad4;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[5][6] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought95.getInstance();
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    double ld2 = 751.6003022823189;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought57.getInstance(fd1, ld2, fd0, fd1, lb0, fb0, fb1, lb0);
    ld2 = fd0 + fd1;
    Thought lo4 = Thought334.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
    ld2 = fd0 - fd1;
    fb1 = !lb0;
    boolean lb5 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld2);
}
    lb5 = fd0 > fd1;
    ld2 *= -1;
    boolean lb6 = false;
    lb6 = fb0 || fb1;

Thought.STACK_COUNTER++;
return fd0;
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
    fd0 *= -1;
    Output.points[5][7] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
    fd1 *= -1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    ab4 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought57.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb1 = !ab1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = fb0 && fb1;
    lb0 = ad1 > ad2;
    lb1 = ad3 < ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
    Output.points[5][8] += ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
        double ld2 = 492.32884635976905;
        boolean lb3 = false;
        ad4 = fd0 + fd1;
        Output.points[6][0] += ld2;
        lb1 = ad1 > ad2;
if(fo0 != null){
          fo1 = fo0.m4();
}
        if (fb0) {
            ad3 *= -1;
if(fo0 != null){
              fo1 = fo0.m4(fb1, lb3, lb0, lb1);
}
            fb0 = fb1 && lb3;
}}
Thought.STACK_COUNTER++;
return fd0;
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
    Output.points[6][1] += ad2;
    double ld0 = 704.3583811302262;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Output.points[6][2] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
        ld0 = ad1 - ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    ab1 = ab2 || ab3;
    boolean lb2 = true;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab4 = fo1.m2(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ld0;
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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    Output.points[6][3] += fd0;
    lb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    fd0 *= -1;
    fd1 *= -1;
    lb1 = lb2 || fb0;
    fb1 = lb0 || lb1;

Thought.STACK_COUNTER++;
return fd0;
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
    ad2 = ad3 - ad4;
    if (fb0) {
        double ld0 = 931.539536435843;
if(ao2 != null){
          ad4 = ao2.m3();
}
        boolean lb1 = false;
        double ld2 = 750.8638856963654;
        fb0 = !fb1;
        lb1 = fb0 && fb1;
        lb1 = fb0 || fb1;
        if (lb1) {
            boolean lb3 = false;
if(ao3 != null){
              ad4 = ao3.m3(lb1, fb0, fb1, lb3);
}
            Output.points[6][4] -= fd0;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld2, ad1, lb1, fb0, fb1, lb3);
}
if(ao4 != null){
              lb1 = ao4.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb3, lb1);
}
            boolean lb4 = false;
            fd1 *= -1;
            lb1 = ld0 < ld2;
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb3, lb4);
}
if(ao4 != null){
              lb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
              ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
            boolean lb5 = true;
            fd0 = fd1 - ld0;
}}
Thought.STACK_COUNTER++;
return ad2;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 532.2603089834809;
if(ao1 != null){
      ao1.m1();
}
    Output.points[6][5] += ld0;
if(ao2 != null){
      fd0 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    Thought lo1 = Thought387.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld2 = 470.0149702517759;
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ld2, fd0, fd1, ld0);
}
    ld2 = fd0 - fd1;
    ld0 *= -1;
    ab1 = ld2 > fd0;
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;

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
    Thought lo0 = Thought396.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      ab2 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
    Output.points[6][6] += fd1;
    double ld2 = 687.0739283795119;
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
}
    ab1 = ab2 || ab3;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb0;
    Output.points[6][7] -= fd1;
    Thought lo1 = Thought204.getInstance();
    boolean lb2 = false;
    lb2 = fd0 < fd1;
    fb0 = !fb1;
    boolean lb3 = true;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
        fd1 *= -1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb1 = lb0 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !lb0;
    boolean lb1 = false;
        Output.points[6][8] -= fd0;

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
    fb1 = fb0 && fb1;
    Output.points[7][0] += ad2;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
    fb1 = ad2 < ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 < ad1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought161.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    fd0 = fd1 - ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    double ld2 = 583.875647337232;
    ad4 = fd0 - fd1;
    lb1 = !fb0;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ad1 *= -1;
    Thought lo0 = Thought348.getInstance(ad2, ad3, ad4, fd0);
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1();
}
    lb1 = ab1 && ab2;
    double ld2 = 603.5762417639518;
    ab3 = !ab4;
    fb0 = fb1 && lb1;
    ad4 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m2(fb0, fb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        double ld0 = 633.3376209133344;
        ld0 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          fd0 = ao2.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        fb1 = ld0 < fd0;
        fd1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        }
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 - fd0;
    Output.points[7][1] -= fd1;
        double ld1 = 767.297460658208;
if(ao3 != null){
      ao3.m1(ld1, fd0, fd1, ld1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;

Thought.STACK_COUNTER++;
return ao4;
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
    Thought lo0 = Thought215.getInstance();
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    lb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    lb1 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - ad1;
    fb0 = fb1 || lb1;
    fb0 = fb1 || lb1;
    ad2 = ad3 + ad4;
    fb0 = fb1 && lb1;
    fb0 = fd0 > fd1;
    fb1 = lb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - ad1;
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    lb1 = fd0 < fd1;
    boolean lb2 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4);
}

Thought.STACK_COUNTER++;
return ao3;
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
    double ld0 = 217.17763206481388;
        ab2 = ld0 < fd0;
    ab3 = ab4 || fb0;
    boolean lb1 = true;
    fb0 = !fb1;
    fd1 *= -1;
    lb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, lb2, ab1, ab2);
}
    boolean lb3 = false;
    boolean lb4 = true;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd1 = ld0 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought204.getInstance();
    ab2 = ab3 || ab4;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, lb1);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;
    Output.points[7][2] += ad1;
    Thought lo2 = Thought256.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb1, ab1);
    boolean lb3 = false;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    Thought lo4 = Thought122.getInstance(ad2, ad3, ad4, fd0);
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    boolean lb5 = false;
    boolean lb6 = true;

Thought.STACK_COUNTER++;
return ao3;
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
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    lb0 = fd1 > fd0;
    Thought lo1 = Thought215.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    double ld2 = 136.21343012920195;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    Thought lo3 = Thought286.getInstance(ld2, fd0, fd1, ld2, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    fb1 = fd1 < ld2;
    lb0 = fb0 || fb1;
    double ld4 = 602.2709657774005;
    Thought lo5 = Thought19.getInstance(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld2);
    ld4 *= -1;
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    double ld6 = 797.040374309149;
    boolean lb7 = false;
    ld2 = ld4 - ld6;
    fd0 = fd1 + ld2;
    lb0 = !lb7;

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
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    lb0 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;

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
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    double ld0 = 350.2064091369684;
    fb1 = !fb0;
        Output.points[7][3] += fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    Thought lo1 = Thought368.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        Output.points[7][4] -= fd0;

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
