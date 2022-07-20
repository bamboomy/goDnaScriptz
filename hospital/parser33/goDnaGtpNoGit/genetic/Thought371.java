package genetic;
import java.util.ArrayList;
class Thought371 extends Thought{
private static ArrayList<Thought371> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 602.227952665288;
private double fd1 = 454.9418227372602;
private Thought fo0 = null;
private Thought fo1 = null;
Thought371 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought371 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought371 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought371 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought371 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought371 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought371 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought371 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought371 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought371 instance = new Thought371 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought371 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought371 instance = new Thought371 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought371 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought371 instance = new Thought371 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought371 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought371 instance = new Thought371 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought371 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought371 instance = new Thought371 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought371 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought371 instance = new Thought371 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought371 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought371 instance = new Thought371 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought371 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought371 instance = new Thought371 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    Output.points[3][4] -= fd1;
    lb0 = fd0 < fd1;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    double ld2 = 580.288302126606;
    boolean lb3 = false;
    ld2 = fd0 - fd1;
    lb1 = lb3 && fb0;
    Thought lo4 = Thought230.getInstance();
if(fo0 != null){
      fo0.m2(fb1, lb0, lb1, lb3);
}
    fb0 = ld2 > fd0;
    fd1 = ld2 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb1, lb0, lb1, lb3);
}
    fd0 = fd1 - ld2;

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
    Output.points[3][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        boolean lb0 = false;
        if (ab4) {
            fd0 = fd1 + fd0;
            Output.points[3][6] -= fd1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
            Output.points[3][7] -= fd1;
            fd0 = fd1 + fd0;
            fb0 = fd1 < fd0;
            fb1 = fd1 < fd0;
            lb0 = ab1 && ab2;
            Output.points[3][8] += fd1;
            } else {
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
}
    Output.points[4][0] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    ad1 *= -1;
    double ld2 = 614.882628144932;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    lb0 = ad4 > fd0;
    lb1 = fd1 > ld2;
    fb0 = fb1 && lb0;
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = fb0 && fb1;

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
    ab1 = ab2 && ab3;
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        ab4 = !fb0;
        boolean lb0 = false;
        fb0 = ad1 < ad2;
        fb1 = !lb0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
        Thought lo1 = Thought294.getInstance();
        ad1 *= -1;
        Thought lo2 = Thought51.getInstance(lb0, ab1, ab2, ab3);
        ad2 *= -1;
        ad3 *= -1;
        ab4 = ad4 < fd0;
        Output.points[4][1] += fd1;
        Output.points[4][2] += ad1;
        double ld3 = 14.113971384610426;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fb1 = !lb0;
        if (ab1) {
            fd0 = fd1 + ld3;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 230.6932891231066;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    Output.points[4][3] -= fd0;
    boolean lb1 = false;
    lb1 = !fb0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
        fd0 = fd1 + ld0;
        fb1 = fd0 < fd1;
        Thought lo2 = Thought246.getInstance();
        lb1 = fb0 && fb1;
        Thought lo3 = Thought227.getInstance(lb1, fb0, fb1, lb1);
        if (fb0) {
            } else if (fb1) {
if(ao2 != null){
              lb1 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
            lb1 = fb0 && fb1;
            Output.points[4][4] += fd1;
            lb1 = ld0 < fd0;
            fb0 = fd1 > ld0;
            double ld4 = 37.15495783297666;
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
    Output.points[4][5] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 737.7968321215991;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb3 = true;
    boolean lb4 = true;
    Output.points[4][6] -= ld2;
    lb1 = ad1 > ad2;
    lb3 = lb4 || fb0;
    fb1 = ad3 < ad4;
    Output.points[4][7] -= fd0;
    fd1 = ld2 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    double ld5 = 312.14937060035527;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ld5, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(ao1 != null){
      ao1.m1();
}
    lb0 = !lb1;
if(ao2 != null){
      ao2.m3(lb3, lb4, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld2, ld5, ad1, lb0, lb1, lb3, lb4);
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought251.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[4][8] -= fd0;
    fd1 *= -1;
    double ld1 = 71.33955353567859;
    fb1 = ld1 > fd0;
if(ao1 != null){
      ao1.m1(fd1, ld1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    ld1 *= -1;
    Output.points[5][0] -= fd0;

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
    ab2 = ab3 || ab4;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      ao1.m3();
}
    if (fb0) {
if(ao2 != null){
          ad2 = ao2.m3(fb1, ab1, ab2, ab3);
}
        Output.points[5][1] -= ad3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
          ad2 = ao3.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo0 = Thought220.getInstance(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
        boolean lb1 = true;
if(ao1 != null){
          ab4 = ao1.m2(ad1, ad2, ad3, ad4);
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
    Thought lo0 = Thought136.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb1 = !fb0;
    Thought lo1 = Thought130.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought232.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = lb3 && fb0;
    fb1 = fd1 < fd0;
    lb3 = fb0 && fb1;
    Thought lo4 = Thought222.getInstance(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb3);
    Output.points[5][2] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought295.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    boolean lb6 = false;
    lb6 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[5][3] += fd0;

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
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 270.1332934753552;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    double ld2 = 414.13341780370956;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    ld2 *= -1;
    fb1 = lb1 || ab1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 904.0334012856722;
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo1.m2(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    ad4 *= -1;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    ld0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    double ld2 = 712.8522149221008;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ld2 = ad1 + ad2;
    double ld3 = 764.5436532155752;
    Thought lo4 = Thought169.getInstance(ad2, ad3, ad4, fd0);
    fb1 = !lb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ld2, ld3);
}
    fb0 = fb1 || lb1;
    double ld5 = 28.739694175020684;
    ld5 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    Output.points[5][4] -= ad1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    Output.points[5][5] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
    Thought lo0 = Thought393.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
    Thought lo2 = Thought261.getInstance(fo1, fo0, fo1, fo0);
    if (ab1) {
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
        Output.points[5][6] += ad4;
        ab2 = ab3 && ab4;
        fb0 = fd0 > fd1;
        fb1 = lb1 || ab1;
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        Output.points[5][7] -= fd0;
        Thought lo4 = Thought38.getInstance();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought128.getInstance(fb1, fb0, fb1, fb0);
    if (fb1) {
        fb0 = fb1 && fb0;
        fd0 = fd1 - fd0;
        Output.points[5][8] += fd1;
        double ld1 = 146.88203276072747;
        boolean lb2 = true;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
        Thought lo3 = Thought81.getInstance(fd0, fd1, ld1, fd0, fb1, lb2, fb0, fb1);
        fd1 = ld1 + fd0;
        lb2 = fd1 < ld1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = ad2 < ad3;
    Output.points[6][0] += ad4;
    fd0 = fd1 + ad1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
        fb0 = ad3 > ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
    double ld1 = 32.14359487262265;
    Thought lo2 = Thought17.getInstance(fo1, ao1, ao2, ao3);
    boolean lb3 = true;
    Thought lo4 = Thought2.getInstance(ld1, ad1, ad2, ad3);
    lb0 = lb3 || fb0;
    Output.points[6][1] -= ad4;
    fd0 = fd1 - ld1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][2] += fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    Thought lo0 = Thought141.getInstance();
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
    ab3 = ab4 && fb0;
    fb1 = fd1 > fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought105.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
    double ld3 = 66.16465816513698;
    ld3 *= -1;

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
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    ab3 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
    ad1 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m2();
}
    ab1 = !ab2;
if(ao2 != null){
      ao2.m1(ab3, ab4, fb0, fb1);
}
    lb0 = ad4 > fd0;
    lb1 = !ab1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        Thought lo2 = Thought346.getInstance(ad4, fd0, fd1, ad1, lb0, lb1, ab1, ab2);
        boolean lb3 = true;
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
        ad1 = ad2 + ad3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
        fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(fo0 != null){
          lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
        boolean lb1 = false;
        fd1 = fd0 - fd1;
        fb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
        Output.points[6][3] -= fd0;
        double ld2 = 783.2627601292538;
        boolean lb3 = false;
        fd0 = fd1 - ld2;
        fd0 = fd1 + ld2;
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld2, fd0, fb1, lb0, lb1, lb3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
        lb3 = fb0 && fb1;
        lb0 = lb1 || lb3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(fd1, ld2, fd0, fd1);
}
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    for(int i1=0; i1<10; i1++){
        double ld4 = 876.1059304134814;
}
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
    if (ab2) {
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo0 = Thought156.getInstance(ab3, ab4, fb0, fb1);
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
        ab4 = fd0 > fd1;
        fb0 = fb1 && lb1;
        ab1 = ab2 && ab3;
        ab4 = fd0 > fd1;
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
        ab2 = fd0 < fd1;
        fd0 *= -1;
        ab3 = ab4 && fb0;
        boolean lb2 = false;
        fb0 = fb1 && lb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 + fd1;
        Thought lo3 = Thought102.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought363.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad2 > ad3;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = fb0 || fb1;
    double ld2 = 406.134892836338;
if(fo1 != null){
          ad3 = fo1.m3(lb1, fb0, fb1, lb1);
}
    Thought lo3 = Thought50.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}

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
    Thought lo0 = Thought291.getInstance(fo1, fo0, fo1, fo0);
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    lb1 = ad4 < fd0;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    lb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    Thought lo2 = Thought299.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
}
    boolean lb3 = true;
    ad3 = ad4 - fd0;
    Output.points[6][4] -= fd1;
    ab1 = ad1 > ad2;
if(fo0 != null){
      ab2 = fo0.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb1, lb3, ab1, ab2);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    double ld4 = 888.8953460941985;
    double ld5 = 508.01386339104647;
    ad4 = fd0 - fd1;
    ab3 = ld4 < ld5;

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
    Thought lo0 = Thought264.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    double ld2 = 486.0454188920529;
    double ld3 = 443.31249200135807;
if(ao4 != null){
      fb0 = ao4.m2(ld3, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
    double ld4 = 51.270020063561574;
    Output.points[6][5] += ld3;
    Thought lo5 = Thought123.getInstance(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ld4 = ao3.m3(fd0, fd1, ld2, ld3);
}
    if (fb0) {
        fb1 = ld4 < fd0;
        lb1 = fd1 > ld2;
if(ao4 != null){
          ld3 = ao4.m3(fo0, fo1, ao1, ao2, ld4, fd0, fd1, ld2);
}
        Output.points[6][6] += ld3;
if(ao3 != null){
          fb0 = ao3.m2();
}
        fb1 = ld4 < fd0;
        double ld6 = 834.7946799124129;
if(fo0 != null){
          ao4 = fo0.m4(lb1, fb0, fb1, lb1);
}
        Output.points[6][7] -= fd0;
        double ld7 = 875.0175167770683;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld6, ld7, fb0, fb1, lb1, fb0);
}
}
Thought.STACK_COUNTER++;
return ld4;
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
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    fb0 = fb1 || fb0;
    double ld0 = 766.5578008910513;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
    ld0 = ad1 - ad2;
    fb0 = fb1 && lb1;
        fb0 = ad3 < ad4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    Thought lo0 = Thought224.getInstance();
    Thought lo1 = Thought90.getInstance(ab1, ab2, ab3, ab4);
    Thought lo2 = Thought280.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    Thought lo3 = Thought82.getInstance(ad3, ad4, fd0, fd1);
    Output.points[6][8] += ad1;
    Thought lo4 = Thought324.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    Output.points[7][0] -= fd1;
    boolean lb5 = false;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        lb5 = !ab1;
        Output.points[7][1] += ad4;
        fd0 = fd1 - ad1;
if(ao3 != null){
          ad2 = ao3.m3();
}
if(ao4 != null){
          ad3 = ao4.m3(ab2, ab3, ab4, fb0);
}
        boolean lb6 = false;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, lb6, lb5);
}
        boolean lb7 = true;
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = true;
    Output.points[7][2] -= fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    double ld0 = 937.3007375261409;
    ab4 = fd0 < fd1;
    fb0 = ld0 < fd0;
    fd1 = ld0 + fd0;
    fb1 = !ab1;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = fd1 < ld0;
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = ab4 || fb0;
    fb1 = ld0 < fd0;
    ab1 = !ab2;
    Thought lo1 = Thought351.getInstance(ab3, ab4, fb0, fb1);
        Output.points[7][3] += fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    double ld2 = 175.83995013757917;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[7][4] += fd1;
    Output.points[7][5] += ld0;
    Thought lo3 = Thought275.getInstance(fo1, fo0, fo1, fo0);

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought392.getInstance();
    fb0 = ad4 < fd0;
    fb1 = fd1 < ad1;
    double ld1 = 524.5049037786499;
    ad1 = ad2 + ad3;
    fb0 = !fb1;
    Output.points[7][6] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld1;
    boolean lb2 = false;
    ad1 = ad2 - ad3;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, lb2, lb3, fb0, fb1);
}
    Thought lo4 = Thought176.getInstance(ad1, ad2, ad3, ad4, lb2, lb3, fb0, fb1);

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
    Thought lo0 = Thought267.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (fb0) {
        } else if (fb1) {
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        ab1 = ab2 && ab3;
        ad4 *= -1;
        fd0 = fd1 - ad1;
        ad2 *= -1;
        ab4 = fb0 || fb1;
        ad3 = ad4 + fd0;
        boolean lb1 = false;
        } else if (ab1) {
        Thought lo2 = Thought169.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        double ld3 = 906.5542420783332;
        fb1 = fd0 > fd1;
        ab1 = ab2 && ab3;
        ab4 = ld3 > ad1;
        fb0 = ad2 > ad3;
        fb1 = ab1 || ab2;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
        ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
        ab1 = ld3 > ad1;
        ad2 = ad3 - ad4;
        ab2 = ab3 && ab4;
        fb0 = fd0 > fd1;
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
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought275.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m2();
}
    Output.points[7][7] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought395.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
    Thought lo2 = Thought359.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ao3.m1(fd1, fd0, fd1, fd0);
}
        fb1 = fd1 < fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
    boolean lb0 = true;
    fb0 = ad3 > ad4;
if(ao1 != null){
          fo1 = ao1.m4();
}
    fb1 = lb0 || fb0;
    boolean lb1 = false;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb0, lb1, fb0);
}
    boolean lb2 = false;
    double ld3 = 957.0145612879614;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld3, fb0, fb1, lb0, lb1);
}
    Output.points[7][8] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
}
    lb1 = lb2 || fb0;
    fb1 = !lb0;
    lb1 = !lb2;
    Thought lo4 = Thought211.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      fb0 = ao2.m2(fd1, ld3, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ld3 *= -1;
    double ld5 = 965.0032811853584;
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb6 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought16.getInstance(ab1, ab2, ab3, ab4);
    fd1 *= -1;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    lb1 = !lb2;
    ab1 = fd1 > fd0;
    Thought lo3 = Thought18.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
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
    boolean lb0 = true;
    Output.points[8][0] -= ad2;
    if (ab1) {
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              ab3 = ao2.m2(ab4, fb0, fb1, lb0);
}
            ab1 = ab2 && ab3;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
            ab1 = !ab2;
if(ao3 != null){
              ao3.m2(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
}}
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
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    Output.points[8][1] += fd0;
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2();
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    double ld2 = 111.48700003485969;
    ld2 = fd0 - fd1;
    ld2 = fd0 + fd1;
    Output.points[8][2] -= ld2;
    boolean lb3 = false;

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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought356.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[8][3] += fd1;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    fd0 *= -1;
    Thought lo0 = Thought43.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought290.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    double ld2 = 447.7995937191683;
    Output.points[8][4] -= fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld2, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    fb0 = fd0 < fd1;
    ld2 *= -1;
    Thought lo3 = Thought378.getInstance();
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld2 - fd0;
if(fo0 != null){
      fo0.m1(fd1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought268.getInstance(fo0, fo1, fo0, fo1);
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
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
