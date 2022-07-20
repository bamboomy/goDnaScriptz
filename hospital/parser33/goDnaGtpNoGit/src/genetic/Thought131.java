package genetic;
import java.util.ArrayList;
class Thought131 extends Thought{
private static ArrayList<Thought131> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 620.4556678105748;
private double fd1 = 332.8050563665379;
private Thought fo0 = null;
private Thought fo1 = null;
Thought131 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought131 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought131 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought131 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought131 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought131 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought131 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought131 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought131 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought131 instance = new Thought131 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought131 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought131 instance = new Thought131 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought131 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought131 instance = new Thought131 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought131 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought131 instance = new Thought131 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought131 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought131 instance = new Thought131 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought131 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought131 instance = new Thought131 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought131 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought131 instance = new Thought131 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought131 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought131 instance = new Thought131 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    fb0 = fd1 > fd0;
    Output.points[4][8] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    double ld1 = 781.1433460760104;
    double ld2 = 792.9760001653489;
    ld1 = ld2 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld2, fd0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ld1 - ld2;
    fb0 = fd0 < fd1;
    ld1 = ld2 - fd0;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0, lb4, fb0, fb1, lb0);
}
    Output.points[5][0] += fd1;
    Thought lo5 = Thought213.getInstance(ld1, ld2, fd0, fd1, lb3, lb4, fb0, fb1);
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb3, lb4, fb0);
}
    fb1 = ld2 > fd0;
    lb0 = fd1 < ld1;
    lb3 = lb4 && fb0;
    ld2 *= -1;

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
    ab1 = !ab2;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[5][1] += fd1;
    Output.points[5][2] += fd0;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought139.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);

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
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
    fb1 = ad1 < ad2;
    fb0 = fb1 && fb0;
    ad3 = ad4 + fd0;
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = !fb0;
    Output.points[5][3] += fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought36.getInstance(fb1, lb0, lb1, fb0);

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
    boolean lb0 = false;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 - ad1;
    boolean lb1 = true;
    ad2 = ad3 + ad4;
    Thought lo2 = Thought136.getInstance(fo0, fo1, fo0, fo1);
    boolean lb3 = true;
    fd0 = fd1 - ad1;
    double ld4 = 554.6901860694816;
    lb3 = ad1 > ad2;
    ad3 = ad4 - fd0;
    ab1 = ab2 || ab3;
    fd1 *= -1;
    ab4 = fb0 || fb1;

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
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
        for(int i1=0; i1<10; i1++){
            Thought lo0 = Thought313.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
            Output.points[5][4] += fd1;
            fb0 = fb1 || fb0;
if(ao1 != null){
              fb1 = ao1.m2();
}
            fd0 = fd1 + fd0;
if(ao2 != null){
              fd1 = ao2.m3(fb0, fb1, fb0, fb1);
}
            boolean lb1 = false;
            lb1 = !fb0;
            fd0 = fd1 - fd0;
            fb1 = !lb1;
            fb0 = fd1 < fd0;
            fd1 = fd0 + fd1;
            double ld2 = 469.7339673946012;
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
              ao2.m2(fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb1);
}
            Thought lo3 = Thought170.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
            boolean lb4 = true;
if(ao1 != null){
              fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
            double ld5 = 564.8628111065252;
            fb0 = fb1 && lb1;
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
    fb1 = !fb0;
    Output.points[5][5] += ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 477.8531119228864;
    boolean lb1 = true;
    fd0 = fd1 - ld0;
    double ld2 = 419.5029006065032;
    Output.points[5][6] -= ld2;
    ad1 *= -1;
    if (fb0) {
if(ao4 != null){
          ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        fb1 = ld0 < ld2;
        double ld3 = 83.53171261016624;
        lb1 = ld2 > ad1;
        ad2 = ad3 + ad4;
        fd0 = fd1 + ld3;
        fb0 = fb1 && lb1;
        double ld4 = 703.8241520032798;
        ld4 = ld0 - ld2;
        Output.points[5][7] += ad1;
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
if(ao1 != null){
      ab2 = ao1.m2();
}
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought74.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        fd1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        } else {
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
    Thought lo0 = Thought181.getInstance(ad1, ad2, ad3, ad4);
    Output.points[5][8] -= fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ab2 = ab3 && ab4;
    if (fb0) {
        for(int i0=0; i0<10; i0++){
            fb1 = !ab1;
if(ao1 != null){
              fo1 = ao1.m4();
}
            ab2 = ab3 && ab4;
            fb0 = ad4 < fd0;
            }
        fd1 = ad1 - ad2;
if(ao2 != null){
          fb1 = ao2.m2(ab1, ab2, ab3, ab4);
}
        boolean lb1 = true;
        ad3 = ad4 + fd0;
        double ld2 = 169.82210375265677;
if(ao3 != null){
          ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1, fb0, fb1, lb1, ab1);
}
        ab2 = !ab3;
if(ao2 != null){
          ao2.m1(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
        ab1 = fd1 < ld2;
        ab2 = ad1 < ad2;
        double ld3 = 830.9580909739199;
        Thought lo4 = Thought355.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
        boolean lb5 = false;
        ad2 = ad3 + ad4;
        boolean lb6 = true;
        fd0 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          lb1 = ao1.m2(fd1, ld2, ld3, ad1);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
        fd1 = fd0 + fd1;
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought348.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    Output.points[6][0] += fd1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
    boolean lb0 = true;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought272.getInstance();
    Thought lo3 = Thought190.getInstance(fb0, fb1, lb0, lb1);
    ab1 = fd0 > fd1;
    ab2 = !ab3;
    if (ab4) {
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        boolean lb4 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    double ld0 = 822.2028226000718;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    double ld2 = 205.53718947298958;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld2, ad1);
}
    lb1 = ad2 > ad3;
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return lb1;
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
    ad3 = ad4 + fd0;
    ab2 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
    ab2 = !ab3;
    Thought lo1 = Thought178.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    Output.points[6][1] += ad3;
    boolean lb2 = true;
    ad4 *= -1;
    lb2 = ab1 || ab2;
    fd0 = fd1 - ad1;
    ab3 = ab4 || fb0;
    ad2 = ad3 + ad4;
    fb1 = lb0 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb2);
}
    Output.points[6][2] += ad1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    Output.points[6][3] -= fd0;
    Thought lo1 = Thought364.getInstance(fd1, fd0, fd1, fd0);
    Output.points[6][4] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    lb0 = fd0 > fd1;

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
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
        lb0 = !fb0;
        boolean lb1 = false;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb0);
}
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb0);
}
        fb0 = fd1 > ad1;
        fb1 = lb1 || lb0;
        Thought lo2 = Thought374.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb0);
        double ld3 = 299.14963702417185;
        ad1 = ad2 + ad3;
        fb0 = ad4 < fd0;
        Thought lo4 = Thought194.getInstance(ao4, fo0, fo1, ao1);
}
Thought.STACK_COUNTER++;
return lb0;
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
    double ld0 = 425.3118633873855;
    ab2 = ab3 || ab4;
if(ao2 != null){
      fb0 = ao2.m2(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    if (fb1) {
        Thought lo1 = Thought90.getInstance();
if(ao3 != null){
          ao3.m1(ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
        fd1 = ld0 - fd0;
        Thought lo2 = Thought55.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
        fb1 = ab1 || ab2;
        ab3 = !ab4;
        fb0 = !fb1;
if(ao3 != null){
          ao2 = ao3.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
        Output.points[6][5] -= fd0;
        boolean lb3 = true;
        ab4 = fd1 < ld0;
        fd0 = fd1 + ld0;
        fb0 = !fb1;
        fd0 = fd1 - ld0;
        lb3 = !ab1;
        ab2 = !ab3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
        ab3 = fd0 > fd1;
        boolean lb0 = false;
        ab3 = !ab4;
        }
    ad1 = ad2 - ad3;
    fb1 = !ab1;
    boolean lb1 = false;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought15.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo3 = Thought221.getInstance(ad1, ad2, ad3, ad4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    boolean lb4 = true;
    Output.points[6][6] -= ad3;

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
    fb0 = fd1 < fd0;
    Thought lo0 = Thought251.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    double ld1 = 312.94809528112046;
    double ld2 = 345.38042616927737;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    ld2 = fd0 - fd1;
    ld1 = ld2 + fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld2, fd0, fb0, fb1, lb3, fb0);
}
    boolean lb4 = true;
    Thought lo5 = Thought280.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb3, lb4);
    Output.points[6][7] -= fd1;

Thought.STACK_COUNTER++;
return ld1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 65.10895109793601;
    Output.points[6][8] -= fd0;
    Output.points[7][0] += fd1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    if (fb0) {
        fb1 = ab1 && ab2;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab3 = !ab4;
if(fo1 != null){
          fo1.m2(fb0, fb1, ab1, ab2);
}
        double ld1 = 905.9452549767645;
        fd0 *= -1;
        ab3 = ab4 || fb0;
        Thought lo2 = Thought159.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ld0, fd0, fb1, ab1, ab2, ab3);
        boolean lb3 = true;
        ab3 = !ab4;
if(fo0 != null){
          fo0.m1(fd1, ld1, ld0, fd0, fb0, fb1, lb3, ab1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        Output.points[7][1] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought152.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought364.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    double ld2 = 834.9739965156684;
    ad1 = ad2 - ad3;
    double ld3 = 342.40675915835254;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld2 > ld3;
    fb1 = ad1 < ad2;
    fb0 = ad3 > ad4;
    double ld4 = 909.2889958840913;
    fb1 = ad4 > fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 < ld2;

Thought.STACK_COUNTER++;
return ld3;
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
    ab1 = ad1 < ad2;
    ab2 = ad3 < ad4;
    Thought lo0 = Thought155.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    ab1 = fd0 > fd1;
    ab2 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab3 = ad4 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    Thought lo1 = Thought220.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fd1 < ad1;
    Output.points[7][2] += ad2;
    boolean lb2 = true;
        ab4 = fb0 || fb1;
    Output.points[7][3] -= ad3;
    ad4 = fd0 - fd1;
    lb2 = ad1 > ad2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !lb0;
        fb0 = fb1 && lb0;
        double ld1 = 804.0348334471055;
        ld1 = fd0 - fd1;
        fb0 = fb1 || lb0;
        boolean lb2 = false;
        Output.points[7][4] += ld1;
        fd0 *= -1;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb2);
}
        double ld3 = 392.85150315767015;
        }
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    Thought lo4 = Thought354.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
    lb0 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[7][5] -= fd1;
    fd0 *= -1;
    boolean lb5 = false;

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
    Thought lo0 = Thought97.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fd0 < fd1;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb1, fb0, fb1);
}
    double ld2 = 47.09775375473626;
    ld2 = ad1 + ad2;
    boolean lb3 = false;

Thought.STACK_COUNTER++;
return ad3;
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
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    boolean lb0 = true;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fd1 *= -1;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && lb0;
    lb1 = lb2 || ab1;

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
if(ao2 != null){
      ab1 = ao2.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad3 = ad4 + fd0;
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 && ab4;
        fd1 = ad1 + ad2;
        boolean lb0 = false;
        ab4 = ad3 < ad4;
        Thought lo1 = Thought295.getInstance(fb0, fb1, lb0, ab1);
        boolean lb2 = false;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb0;
        Output.points[7][6] -= ad3;
        Output.points[7][7] -= ad4;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ad1, ad2, lb2, ab1, ab2, ab3);
}
        ab4 = ad3 < ad4;
        boolean lb3 = true;
        Output.points[7][8] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
        lb2 = lb3 || ab1;
        boolean lb4 = true;
        Thought lo5 = Thought5.getInstance(fo0, fo1, ao1, ao2);
        ab1 = fd1 > ad1;
        Thought lo6 = Thought272.getInstance(ad2, ad3, ad4, fd0);
        boolean lb7 = true;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = lb0 || fb0;
    fb1 = !lb0;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = !lb0;
    Output.points[8][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought283.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    Thought lo2 = Thought323.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought78.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    Thought lo4 = Thought346.getInstance();
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Output.points[8][1] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Output.points[8][2] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    Output.points[8][3] -= fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(lb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
        fd0 *= -1;
    boolean lb2 = true;
    Output.points[8][4] -= fd1;
    Thought lo3 = Thought326.getInstance(fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
    fd0 *= -1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    Thought lo1 = Thought273.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1();
}
    Thought lo3 = Thought330.getInstance(lb2, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb2, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    boolean lb4 = false;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[8][5] += ad3;
    Output.points[8][6] -= ad4;
    lb4 = fd0 < fd1;
    ad1 = ad2 - ad3;
    fb0 = fb1 || lb0;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    fd0 *= -1;
    Thought lo0 = Thought328.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 || fb1;
    lb1 = fd0 > fd1;
    ab1 = ab2 && ab3;
    ad1 = ad2 - ad3;
    if (ab4) {
        fb0 = ad4 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
        boolean lb2 = true;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        } else {
        if (fb1) {
            for(int i0=0; i0<10; i0++){
                ad2 = ad3 + ad4;
}}}
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
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Output.points[8][7] -= fd1;
    Thought lo0 = Thought8.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    Thought lo2 = Thought343.getInstance(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
    fb0 = fd0 > fd1;
    if (fb1) {
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
        fb0 = fd1 > fd0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
        fb1 = lb1 && fb0;
        fb1 = !lb1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao3 != null){
      ao3.m2(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = !ab1;
    boolean lb0 = false;
    double ld1 = 563.9214161836377;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought252.getInstance(ao1, ao2, ao3, ao4);
    ab2 = fd0 > fd1;
    ab3 = ld1 > fd0;
    Output.points[8][8] -= fd1;
    ab4 = fb0 && fb1;
if(fo0 != null){
          ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);
}
    boolean lb3 = false;
    Thought lo4 = Thought248.getInstance();

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][0] += ad1;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    double ld1 = 807.4924574795903;
    ab4 = !fb0;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(ad4, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}

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
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        double ld0 = 410.51161501038405;
    boolean lb1 = false;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    double ld2 = 23.558155655427136;

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
if(fo0 != null){
      fo0.m2();
}
    Thought lo0 = Thought189.getInstance(fb0, fb1, fb0, fb1);
    Output.points[0][1] -= fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought350.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;

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
        fd0 = fd1 + fd0;
    double ld0 = 74.44189822359115;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld0;
    boolean lb1 = true;
    fb0 = !fb1;
    lb1 = fd0 < fd1;
    double ld2 = 348.7652198972018;
    ld0 = ld2 + fd0;
    fb0 = !fb1;
    lb1 = fb0 && fb1;
if(fo1 != null){
      lb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, lb1, fb0, fb1, lb1);
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
}
